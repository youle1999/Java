import java.util.Random;

class Omojan {
    public static void main(String[] args) {
        // ���t�͓K���ɕ��������Ă�������
        String[] words = {
            "�u���[�^�X", "���O����", "�T�C��", "������ꂽ", "�Ј���", "��������܂���", 
            "������", "����", "���X�g", "�N���X�}�X", "�`����", "���t", "�~���a��", 
            "24��", "��k", "����Ȃ�", "�v���|�[�Y", "����", "����", "�x�@", 
            "�ؗ�Ȃ�", "�ꑰ", "�r�b�O", "�}�l�[", "�E��", "�T�C���[��p", "�T�C�N", 
            "�̂т���", "���|", "����", "����", "���a�I"
        };

        Random rand = new Random();
        int index1 = rand.nextInt(words.length);
        int index2 = rand.nextInt(words.length);
        
        System.out.println(words[index2] + " " + words[index1]);
    }
}
