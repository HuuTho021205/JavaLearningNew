package Ngay5_OOP.Abstract;
/* 1.  Tạo abstract class Character:
        * - Thuộc tính protected String name, protected int health.
        * - Phương thức TRỪU TƯỢNG public abstract void attack(Character target);.
        *
        * 2.  Tạo 2 interface cho các kỹ năng:
        * - MagicCaster: Có phương thức void castSpell(Character target);.
        * - Stealthable: Có phương thức void hide();.
        *
        * 3.  Tạo các lớp nhân vật cụ thể:
        * - Warrior kế thừa từ Character:
        * - Ghi đè attack() để in ra "[Tên Warrior] swings a sword at [Tên mục tiêu]!".
        * - Mage kế thừa từ Character VÀ thực thi MagicCaster:
        * - Ghi đè attack() để in ra "[Tên Mage] shoots a weak bolt at [Tên mục tiêu]!".
        * - Định nghĩa castSpell() để in ra "[Tên Mage] casts a fireball at [Tên mục tiêu]!".
        * - Rogue kế thừa từ Character VÀ thực thi Stealthable:
        * - Ghi đè attack() để in ra "[Tên Rogue] backstabs [Tên mục tiêu]!".
        * - Định nghĩa hide() để in ra "[Tên Rogue] vanishes into the shadows!".
        *
        * 4.  Trong hàm main:
        * - Tạo một mảng Character[] party = new Character[3]; và cho vào đó 1 Warrior, 1 Mage, 1 Rogue.
 * - Dùng vòng lặp for để bắt tất cả các nhân vật attack() một con quái vật (new Warrior("Orc", 100)).
        * - Dùng vòng lặp for một lần nữa, bên trong dùng `instanceof` để kiểm tra:
        * - if (character instanceof MagicCaster) thì gọi castSpell().
        * - if (character instanceof Stealthable) thì gọi hide().
        */
public class Character {
}
