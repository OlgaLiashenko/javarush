package com.javarush.level7;

//1. Создай список слов, заполни его самостоятельно.
//2. Метод fix должен:
//2.1. удалять из списка строк все слова, содержащие букву "r"
//2.2. удваивать все слова содержащие букву "l".
//2.3. если слово содержит и букву "r" и букву "l", то оставить это слово без изменений.
//2.4. с другими словами ничего не делать.
import java.util.ArrayList;
public class ArrayListLetterL {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("lose"); // 1
        list.add("role"); // 2
        list.add("home"); // 3
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            boolean hasL = list.get(i).contains("l");
            boolean hasR = list.get(i).contains("r");

//            if (hasR && !hasL) {
//                list.remove(i);
//            } else if (!hasR && hasL) {
//                list.add(i, list.get(i));
//            }
            if (hasL && hasR) {
                continue;
            }
            if (hasR) {
                list.remove(i);
            }
            if (hasL) {
                list.add(i, list.get(i));
            }
        }
        return list;
    }
}

//Например у тебя идут роза, лоза, лира. Ты идешь на увеличение, проверяешь 0 элемент, там буква "р",
// он удаляет элемент и лоза становится 0 элементом и ты ее перескакиваешь не проверяя.
// В данном конкретном случае "лоза" не задвоится, хотя по условию должна.
//А когда ты идешь на уменьшение, ты идешь с конца и сдвиги тебе не страшны, поэтому программа выполняется правильно.