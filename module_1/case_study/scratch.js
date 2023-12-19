function utopianTree(n) {
    // Write your code here
    let res = 1;
    for (let i = 1; i <= n; i++) {
        if (i % 2 === 0) res++;
        else res *= 2
    }
    return res;

}