package basic.dogClass;

/*
 * һ������԰����������ͱ�����
 * �ֲ��������ڷ��������췽�����������ж���ı�������Ϊ�ֲ����������������ͳ�ʼ�������ڷ����У����������󣬱����ͻ��Զ����١�
 * ��Ա��������Ա�����Ƕ��������У�������֮��ı��������ֱ����ڴ��������ʱ��ʵ��������Ա�������Ա����з��������췽�����ض����������ʡ�
 * ������������Ҳ���������У�������֮�⣬����������Ϊstatic���͡�
 * 
 */
public class Dog{
	String name="just a dog";
	String breed;
	int age;
	String color;
	
	/*
	 * ÿ���඼�й��췽�������û����ʽ��Ϊ�ඨ�幹�췽����Java����������Ϊ�����ṩһ��Ĭ�Ϲ��췽����
	 * �ڴ���һ�������ʱ������Ҫ����һ�����췽�������췽�������Ʊ�������ͬ����һ��������ж�����췽����
	 * ������һ�����췽��ʾ����
	 */
	public Dog() {
		System.out.println("���캯����name="+name);
	}
	
	public Dog(String nameIn){
		// �������������һ��������nameIn
		name=nameIn;
		System.out.println("���صĹ��캯����name="+name);
	}
	
	public String GetName(){
		return name;
	}
	
	public void SetName(String nameIn) {
		name=nameIn;
	}
	
	//��ͨ����	 
	public void sleeping(){
		System.out.println("��ͨ������sleeping");
	}
}
