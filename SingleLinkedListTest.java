public class SingleLinkedListTest {
    public static void main(String[] args){
		SingleLinkedList singleLinkedList=new SingleLinkedList();
		System.out.println("初始线性表：");
		for(int i=0;i<10;i++){
			singleLinkedList.insert(i, i);
		}
		singleLinkedList.print();
		
		System.out.println("在位置4插入元素9后的线性表：");
		singleLinkedList.insert(4, 9);
 
		singleLinkedList.print();
		
		System.out.println("表尾插入元素0后的线性表：");
		singleLinkedList.append(0);
		singleLinkedList.print();
		
		System.out.println("删除第5个元素后的线性表：");
		singleLinkedList.delete(5);

    }
}
