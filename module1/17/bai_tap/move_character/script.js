function Character(sprite, top, left, size) {
    this.sprite = sprite;
    this.top = top;
    this.left = left;
    this.size = size;

}

Character.prototype.moveCharacter = function (evt) {
    console.log(evt.key);
    switch (evt.key) {
        case 'ArrowDown':
            this.top -= 5;
            break;
        case 'ArrowUp':
            this.top += 5;
            console.log(crying.top);
            break;
        case 'ArrowLeft':
            this.left -= 5;
            break;
        case 'ArrowRight':
            this.left += 5;
            break;
    }
    update();

}

Character.prototype.setCharacter = function () {
    return `<img src='${this.sprite}' width="${this.size}" height="${this.size}" style="top: ${this.top} ; left: ${this.left}; position:absolute;" alt="Sprite error">`
}

let crying = new Character('ToT.png', 20, 30, 200);

function update() {
    document.getElementById('game').innerHTML = crying.setCharacter();
}

function start() {
    addEventListener('keydown', crying.moveCharacter);
    update();
}


