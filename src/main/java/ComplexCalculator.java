    import java.util.Scanner;

    /**
     * @author Ashchepkov Vladislav
     */
    public class ComplexCalculator {

        public static void main(String[] args) {
            Scanner Digit = new Scanner(System.in);

            System.out.println ("Если Вы хотите запустить 'Калькулятор' введите - 1, хотите запустить поиск самого" +
                    " максимального элемента в массиве введите - 2: ");
            //Считываем значение введённое пользователем в переменную "choice"
            int choice = Digit.nextInt();

            if (choice == 1) {
                //Пользователь запустил "Калькулятор"
                System.out.println ("Запущен Калькулятор. Введите первое число: ");
                //Считываем первое значение введённое пользователем в переменную "firstNum"
                double firstNum = Digit.nextDouble();

                System.out.println ("Введите второе число ");
                //Считываем второе значение введённое пользователем в переменную "secondNum"
                double secondNum = Digit.nextDouble();

                System.out.println("Введите одно из четырёх арифметических действий (+,-,/,*): ");
                //Считываем арифметическое действие введённое пользователем в переменную "arithOp"
                String arithOp = Digit.next();

                String plusMob = "+";
                String minusMob = "-";
                String umnozMob = "*";
                String delenMob = "/";


                double total;

                if (arithOp.equals(plusMob)) {
                    //Вычисляем сумму чисел и передаём её в переменную "total"
                    total = firstNum + secondNum;
                    System.out.printf("Сумма: %.4f", total);
                }
                else {
                    if (arithOp.equals(minusMob)) {
                        //Вычисляем разность чисел и передаём её в переменную "total"
                        total = firstNum - secondNum;
                        System.out.printf("Разность: %.4f", total);
                    }
                    else {
                        if (arithOp.equals(umnozMob)) {
                            //Вычисляем произведение чисел и передаём его в переменную "total"
                            total = firstNum * secondNum;
                            System.out.printf("Произведение: %.4f", total);
                        } else {
                            if (arithOp.equals(delenMob)) {
                                //Вычисляем частное чисел и передаём её в переменную "total"
                                total = firstNum / secondNum;
                                System.out.printf("Частное: %.4f", total);
                            }
                            else {
                                System.out.print("Введены некорректные данные");
                            }
                        }
                    }
                }
            }
            else {
                if (choice == 2) {
                    //Пользователь запустил "Поиск максимального элемента массиве"
                    System.out.print("Запущен поиск максимального элемента массиве. ");
                    //Считываем значение введённое пользователем в переменную "numLen"
                    System.out.println("Введите количество элементов массива: ");
                    int numLen = Digit.nextInt();

                    //Объявляем массив строк размером numLen
                    String terminArr[] = new String[numLen];

                    System.out.println("Введите слова желательно разной длины через 'Enter' в количестве равном " + numLen + ": ");

                    //Считываем слова введённые пользователем и создаём массив
                    for (int i = 0; i < numLen; i++) {
                        terminArr[i] = Digit.next();
                    }
                    System.out.println ("Введённые слова: ");
                    for (int i = 0; i < numLen; i++) {
                        System.out.println (terminArr[i]+", ");
                    }
                    //Вычисляем самое длинное слово
                    int looong = 0;
                    String wordDD = null;
                    for (int i = 0; i < numLen; i++) {
                        if (terminArr[i].length() > looong) {
                            looong = terminArr[i].length();
                            wordDD = terminArr[i];
                        }
                    }
                    System.out.println ("Слово '" +wordDD+ "' самое длинное");
                    System.out.println ("В нём " +looong+ " букв");
                }

                else {
                    System.out.print ("Вы ввели недопустимое значение.");
                }

            }
        }
    }

