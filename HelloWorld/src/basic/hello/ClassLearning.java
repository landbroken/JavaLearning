package basic.hello;

import basic.dogClass.Dog;

/*
 * ����һ��Դ�ļ��ж������࣬���һ���import����package���ʱ��Ҫ�ر�ע����Щ����

һ��Դ�ļ���ֻ����һ��public��
һ��Դ�ļ������ж����public��
Դ�ļ�������Ӧ�ú�public�����������һ�¡����磺Դ�ļ���public���������Employee����ôԴ�ļ�Ӧ������ΪEmployee.java��
���һ���ඨ����ĳ�����У���ôpackage���Ӧ����Դ�ļ������С�
���Դ�ļ�����import��䣬��ôӦ�÷���package�����ඨ��֮�䡣���û��package��䣬��ôimport���Ӧ����Դ�ļ�����ǰ�档
import����package����Դ�ļ��ж���������඼��Ч����ͬһԴ�ļ��У����ܸ���ͬ���಻ͬ�İ�������
*/

public class ClassLearning {

	public static void main(String[] args) {
		Dog dog1=new Dog();
		System.out.println(dog1.GetName());
		
		Dog dog2=new Dog("tony");
		dog2.SetName("mike");
		System.out.println(dog2.GetName());
	}

}
