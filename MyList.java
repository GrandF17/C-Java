class ListElement {
    ListElement next;    // указатель на следующий элемент
    String data;            // данные
}

class MyList {
    private ListElement head;       // указатель на первый элемент
    private ListElement tail;       // указатель последний элемент

    void addFront(String data) {          //добавить спереди
        ListElement a = new ListElement();  //создаём новый элемент
        a.data = data;              //инициализируем данные.
        // указатель на следующий элемент автоматически инициализируется как null
        if(head == null)            //если список пуст
        {                           //то указываем ссылки начала и конца на новый элемент
            head = a;               //т.е. список теперь состоит из одного элемента
            tail = a;
        }
        else {
            a.next = head;          //иначе новый элемент теперь ссылается на "бывший" первый
            head = a;               //а указатель на первый элемент теперь ссылается на новый элемент
        }
    }

    void deleteFront() {         //удаление элемента
        if(head == null)        //если список пуст -
            return;             //ничего не делаем

        if (head == tail) {     //если список состоит из одного элемента
            head = null;        //очищаем указатели начала и конца
            tail = null;
        }
        else {
            head = head.next;       //переключаем указатель начала на второй элемент
        }
    }

    void deleteCurrent(String data) {
        if(head == null)        //если список пуст -
            return;             //ничего не делаем

        if (head.data.equals(data)) {    //если первый элемент - тот, что нам нужен
            head = head.next;       //переключаем указатель начала на второй элемент
            return;                 //и выходим
        }

        ListElement t = head;       //иначе начинаем искать
        while (t.next != null) {    //пока следующий элемент существует
            if (t.next.data.equals(data)) {  //проверяем следующий элемент
                if(tail == t.next)      //если он последний
                {
                    tail = t;           //то переключаем указатель на последний элемент на текущий
                }
                t.next = t.next.next;   //найденный элемент выкидываем
                return;                 //и выходим
            }
            t = t.next;                //иначе ищем дальше
        }
    }

    void addBack(String data) {          //добавление в конец списка
        ListElement a = new ListElement();  //создаём новый элемент
        a.data = data;
        if (tail == null)           //если список пуст
        {                           //то указываем ссылки начала и конца на новый элемент
            head = a;               //т.е. список теперь состоит из одного элемента
            tail = a;
        } else {
            tail.next = a;          //иначе "старый" последний элемент теперь ссылается на новый
            tail = a;               //а в указатель на последний элемент записываем адрес нового элемента
        }
    }

    int howMany() {
        if(head == null)        //если список пуст -
            return 0;             //ничего не делаем

        ListElement t = head;       //иначе начинаем искать
        int i = 0;
        while (t != null) {    //пока следующий элемент существует
            i++;
            t = t.next;
        }
        return i;
    }

    void deleteAll() {
        if(head == null)        //если список пуст -
            return;             //ничего не делаем
        head = tail;
        head = null;
    }

    void printList() {              //печать списка
        ListElement t = this.head;       //получаем ссылку на первый элемент
        while (t != null)           //пока элемент существует
        {
            System.out.print(t.data + " "); //печатаем его данные
            t = t.next;                     //и переключаемся на следующий
        }
        System.out.println();
    }
}