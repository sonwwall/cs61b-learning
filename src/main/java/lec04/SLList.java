package lec04;

//这里的 Mustard 是 泛型类型参数，意思是：
//这个类 SLList 在定义时并不指定具体存储的数据类型，而是由使用者在实例化时决定。
//其实就是泛型
public class SLList<Mustard>{
    //嵌套类
    //这里加上static就不能访问IntNode以外的东西了
    private  class MustardNode {
        public Mustard item;
        public MustardNode next;

        public MustardNode(Mustard i, MustardNode n){
            item=i;
            next=n;
        }
    }

    //这是一个虚拟节点放在list前面
    //真正的第一个元素是sentinel.next
    private MustardNode sentinel;
    private int size;

    public SLList(int x){
        sentinel =new MustardNode(null,null);
        sentinel.next=new MustardNode(null,null);
        size=1;
    }

    public void addFirst(Mustard x){
        sentinel.next =new MustardNode(x, sentinel.next);
        size++;
    }

    public void addLast(Mustard x){

        MustardNode p= sentinel;

        while(p.next!=null){
            p=p.next;
        }
        p.next=new MustardNode(x,null);
        size++;
    }

    public Mustard getFirst(){
        return sentinel.item;
    }

    public int size(){
        return size;
    }

    public SLList(){
        sentinel =new MustardNode(null,null);//这个数字并不重要，只是必须有一个在这里罢了
        size=0;
    }





}