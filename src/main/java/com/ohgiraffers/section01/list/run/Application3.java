package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. LinkedList에 대해 이해하고 사용할 수 있다. */
        /* LinkedList
        * ArrayList가 배열을 이용해서 발생할 수 있는 성능적인 단점을 보완하고자 고안되었다.
        * 내부는 이중연결리스트로 구현되어 있다.
        *
        * 단일 연결 리스트
        * : 저장한 요소가 순서를 유지하지 않고 저장되지만 이러한 요소들 사이를 링크로 연결하여 구성하며
        *   마치 연결된 리스트 형태인 것 처럼 만든 자료구조이다.
        *   요소의 저장과 삭제 시 다음 요소를 가리키는 참조 링크만 변경하면 되기 때문에
        *   요소의 저장과 삭제가 빈번하게 일어나는 경우 ArrayList보다 성능면에서 우수하다.
        *   하지만 단일 연결 리스트는 다음 요소만 링크하기 때문에 이전 요소로 접ㄱㄴ하기가 어렵다.
        *   이를 보완하고자 만든 것이 이중 연결 리스트이다.
        *
        * 이중 연결 리스트
        * : 단일 연결 리스트는 단음 요소만 링크하는 반면 이중 연결 리스트는 이전 요소도 링크하며
        *   이전 요소로 접근하기 쉽게 고안된 자료구조이다.
        *
        *  LinkedList는 이중 연결 리스트를 구현한 것이며 역시 List 인터페이스를 상속받아서
        *  ArrayList와 사용하는 방법이 거의 유사하다.
        *  하지만 내부적으로 요소를 저장하는 방법에 차이가 있는 것이다.
        *  각 컬렉션 프레임워크 클래스들릐 특징을 파악하고 그에 따라 적합한 자료구조를 구현한 클래스를 선택하는 것이 좋다.
        * */

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("mango");
        linkedList.add("grape");

        System.out.println(linkedList.size());
        for (int i =0; i < linkedList.size(); i++) {
            System.out.println(i + " : " + linkedList.get(i));
        }

        linkedList.remove(1);
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        linkedList.set(0, "fineapple");
        System.out.println(linkedList);

        System.out.println(linkedList.isEmpty());   // 비워있지 않기 때문에 false 출력

        linkedList.clear(); // 리스트내의 모든 요소를 지워줌
        System.out.println(linkedList.isEmpty());   // 비워있으므로 true 출력
    }
}
