# Добавляем тесты и разворачиваем простейший CI/CD
### Описание
Программа Mtz считывает из файла числа, а далее отдельными функциями ищет среди этих чисел минимальное число, максимальное число, считать их общую сумму и произведение.
### Как запуустить Mtz
1. Открываем терминал и компилируем файл Mtz.java.

      <img width="150" alt="image" src="https://github.com/Nickystm/ptz2/assets/167700874/8565f12e-db26-4479-aa76-8e2bf62f3d49">


2. Теперь укажите операцию, которую хотите выполнить и путь к нужному вам файлу с числами.

   <img width="200" alt="image" src="https://github.com/Nickystm/ptz2/assets/167700874/66f0e89d-e598-44dc-918c-9ff695dc61cc">

### Пример работы программы
1. Создадим файл (tftz1) и заполним его числами через пробел (5 3 2 7 6).
2. Откроем "Терминал" и запустим работу программы по инстгрукции выше.
  * Сумма:
    
    <img width="330" alt="image" src="https://github.com/Nickystm/project2/assets/167700874/972d7683-d808-4731-9cc7-7287ce346a56">

  * Минимум:
   
    <img width="330" alt="image" src="https://github.com/Nickystm/project2/assets/167700874/593e0098-dd11-4c91-bc33-7ac7f1cdf5e2">

  * Максимум:

    <img width="330" alt="image" src="https://github.com/Nickystm/project2/assets/167700874/f6323c33-3b76-4b58-808f-b352d7abb48a">

  * Произведение:

    <img width="333" alt="image" src="https://github.com/Nickystm/project2/assets/167700874/33589c5a-375d-4832-9f6b-0709c0b46b5d">

### Как запустить Ctz(проверка корректности работы функций)
1. Необходимо установить Maven.
2. Можно скомпилировать код перед запуском тестов с помощтю mvn compline.

   <img width="150" alt="image" src="https://github.com/Nickystm/ptz2/assets/167700874/cb2f84c9-6c18-4a34-baba-4f8e82154571">

3. Теперь запускаем с помощью mvn test

   <img width="105" alt="image" src="https://github.com/Nickystm/ptz2/assets/167700874/9fff5db5-3373-4aac-ae43-3f0039d58806">

4. Если тест корректен, вывод будет таким(default-test):

   <img width="485" alt="image" src="https://github.com/Nickystm/ptz2/assets/167700874/5e59768a-1edf-46d2-9d06-c48a362ce93e">

### Как запустить Stz(проверка скорости работы программы при увеличении размера входного файла)
1. Запуск осуществляет через IntelliJ IDEA CE.
2. Чтобы запустить тест(естественно имея все файлы/папки/коды которые даны в репозитории, необходимо нажать Run 'Stz.java'. Время работы программы выведется рядом с обозначением количества чисел в файле.

### График зависимости времени выполнения от кол-ва чисел в файле

<img width="657" alt="image" src="https://github.com/Nickystm/ptz2/assets/167700874/bf54de38-6b7c-45d8-bede-3f5c15e5d0ef">

### Чтобы запустить тесты в ручном режиме, необходимо:
1. Нажать на иконку справа или перейти в Action.
    [![Tests](https://github.com/Nickystm/project2/actions/workflows/tests.yml/badge.svg)](https://github.com/Nickystm/project2/actions/workflows/tests.yml)
3. Нажать на Java CI.
4. Запустить Run workflow.

