**IN PROCESS**

# **Кофемашина**

Представляет собой сам аппарат, в который мы засыпаем кофе, наливаем воду и запускаем алгоритм приготовления напитка.

**Данные:**

* Текущее количество воды в машине измеряется в миллилитрах;
* Максимально допустимое количество воды в машине;
* Текущее количество кофе в машине в граммах;
* Максимально допустимое количество кофе в машине;
* Норма потребления кофе при приготовлении напитка с максимально крепостью (крепость напитка измеряется от 0 до 1, где 1 самый крепкий);

**ENUM с типами кофе:** молотый GROUND и в зернах BEANS.

Поля: описание – содержит описание на русском, для GROUND описанием будет «молотый», для BEANS описанием будет «в зернах»
Конструктор: принимает параметр строку с описанием и проставляет его в соответствующее поле класса

**ENUM:** крепость приготовляемого напитка в виде 3-х фиксированных значений:
* MILD - 0.5
* NORMAL - 0.75
* STRONG - 1.0


**Методы:**

* Получение текущего остатка кофе в кофемашине в виде строки типа «Кофе осталось 289.5 г».
* Получение текущего остатка кофе в кофемашине в виде строки типа «Воды осталось 800 мл».
* Наполнение воды в кофемашину, метод принимает параметр, какое количество воды нужно добавить к текущему остатку воды, и отслеживает, чтобы текущий остаток не превышал максимально допустимое количество воды.
* Наполнение кофе в кофемашину, метод принимает параметр, какое количество кофе нужно добавить к текущему остатку кофе, и отслеживает чтобы текущий остаток не превышал максимально допустимое количество кофе. Вторым параметром метод принимает класс кофе.
* Приготовить напиток. Метод принимает параметры крепость напитка (от 0 до 1) и объем чашки и реализует следуюий алгоритм:

1. Проверяет объем чашки. Если он больше текущего объема воды, то возвращает строку «Долейте воды».
2. Проверяет, хватит ли кофе на приготовление напитка (по формуле Норма потребления умножить на крепость). Если кофе не хватает, то возвращает строку «Досыпьте кофе».
3. Если всего хватает, то вычитает объем чашки от текущего объема воды в кофемашине и необходимый для приготовления объем кофе от текущего объема кофе в кофемашине и выводит сообщение типа «Готовлю Jacobs объемом 200 крепость 0.7»


**Вывод:**

* Вызвать метод приготовления напитка
* Вывести ошибку в консоль
* Заполнить кофемашину водой через соответствующий метод
* Вызвать метод приготовления напитка
* Вывести ошибку в консоль
* Засыпать в кофемашину кофе через соответствующий метод
* Вызвать метод приготовления напитка
* Вывести в консоль отчет кофемашины о приготовлении кофе
* Вывести в консоль текущий остаток воды в кофемашине
* Вывести в консоль текущий остаток кофе в кофемашине
