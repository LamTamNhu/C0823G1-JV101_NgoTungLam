class Character {
    constructor(sprite, top, left, size, speed) {
        this.sprite = sprite;
        this.top = top;
        this.left = left;
        this.size = size;
        this.speed = speed;
    }
}


Character.prototype.moveCharacter = function (evt) {
    console.log(evt.key);
    switch (evt.key) {
        case 'ArrowUp':
            this.top -= this.speed;
            break;
        case 'ArrowDown':
            this.top += this.speed;
            break;
        case 'ArrowLeft':
            this.left -= this.speed;
            break;
        case 'ArrowRight':
            this.left += this.speed;
            break;
    }
    update();

}

Character.prototype.setCharacter = function () {
    return `<img src="${this.sprite}" width="${this.size}" height="${this.size}" style="top: ${this.top}` + "px" + ` ; left: ${this.left}` + "px" + ` ; position:absolute;"
     alt="Sprite error">`
}

let crying = new Character('ToT.png', 200, 300, 200,50);

// crying.moveCharacter()

function update() {
    document.getElementById('game').innerHTML = crying.setCharacter();
}

function start() {
    addEventListener('keydown', crying.moveCharacter.bind(crying));
    update();
}





