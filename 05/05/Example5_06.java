class StudentCard {
    // �K�v�ȃt�B�[���h����͍ς�
    int id;
    String name;
}


public class Example5_06 {
    public static void main(String[] args) {
        // null�͎Q�ƌ^�̕ϐ��̒l��?�r�ł���
        StudentCard a = new StudentCard();


        // null�́A�Q�ƌ^�̕ϐ��ɑ�?�ł���
        a = null; // �w���ɏ]���ăR�����g�A�E�g����


        if (a == null) {
            System.out.println("a��null");
        } else {
            System.out.println("a��null�ł͂Ȃ�");
        }


    }
}

