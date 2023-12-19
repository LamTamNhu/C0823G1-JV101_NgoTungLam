package repository;

import model.ChiTieu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Repository implements IRepository {
    private final String GET_LOAI_CHI_TIEU = "SELECT * FROM loai_chi;";
    private final String GET_ALL = "select ten, ngay_chi, so_tien_chi, ten_loai_chi, mo_ta_them\n" +
                                   "from chi_tieu as c\n" +
                                   "JOIN loai_chi as l on c.id_loai_chi=l.id;";
    private final String INSERT = "insert into module_3_test.chi_tieu(ten,ngay_chi,so_tien_chi,mo_ta_them,id_loai_chi)VALUES(?,?,?,?,?);";

    @Override
    public List<ChiTieu> getAll() {
        Connection con = BaseRepository.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement(GET_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<ChiTieu> list = new ArrayList<>();
            while (resultSet.next()) {
                String ten = resultSet.getString("ten");
                LocalDate ngay_chi = resultSet.getDate("ngay_chi").toLocalDate();
                int soTienChi = resultSet.getInt("so_tien_chi");
                String tenLoaiChi = resultSet.getString("ten_loai_chi");
                String moTaThem = resultSet.getString("mo_ta_them");
                list.add(new ChiTieu(ten, ngay_chi, soTienChi, tenLoaiChi, moTaThem));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert preparedStatement != null;
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    @Override
    public List<String> getLoaiChiTieu() {
        Connection con = BaseRepository.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement(GET_LOAI_CHI_TIEU);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<String> loaiChi = new ArrayList<>();
            while (resultSet.next()) {
                loaiChi.add(resultSet.getString("ten_loai_chi"));
            }
            return loaiChi;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                assert preparedStatement != null;
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void add(ChiTieu chiTieu) {
        Connection con = BaseRepository.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement(INSERT);
            preparedStatement.setString(1, chiTieu.getTen());
            preparedStatement.setString(2, String.valueOf(chiTieu.getNgayChi()));
            preparedStatement.setInt(3, chiTieu.getSoTienChi());
            preparedStatement.setInt(4, 3);
            preparedStatement.setString(5, chiTieu.getMoTaThem());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                assert preparedStatement != null;
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

