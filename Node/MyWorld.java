import greenfoot.*;  
import java.util.ArrayList;

public class MyWorld extends World
{
    private Node node, first,second,last;
    ArrayList<Node> nodes = new ArrayList<Node>();
    public MyWorld()
    {
        super(600, 400, 1); 
        node = new Node(null);
        first = node;
        addObject(node, 300, 200);
        System.out.println("here");
        for (int j = 1; j < 10; j++){
            node = new Node(node);
            addObject(node, 300, 200);
            last = node;
            nodes.add(node);
        }
    }

    public void act(){
        String key = Greenfoot.getKey();
        if (key != null){
            if ( key.equals("n")){
                addNode();
            }

            if ( key.equals("r")){
                removeNode();
            }

            if( key.equals("f")){
                removeFirstNode();
            }
        }
    }

    public int[] getNewLocation(){
        int[] location;
        if(getObjects(null).contains(first)){
            location = new int[]{first.getX(), first.getY()};
        }else{
            location = new int[]{Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight())};
        }
        return location;
    }

    public void addNode(){
        if(first == null){
            first = node;
            node = new Node(null);
        }
        else if(first == last)
        {
            node = new Node(first);
            last = node;            
        }
        else
        {
            node = new Node(last);
            node = last;
        }
        int[] loc = getNewLocation();
        addObject(node, loc[0], loc[1]);
        nodes.add(node);
    }

    public void removeNode(){
        if ( last != null ){
            removeObject(last);
            last = last.getTarget();
            first = last == null ? null : first;
            nodes.remove(node);
        }
    }

    public void removeFirstNode(){
        if ( first != null ){
            removeObject(first);
            nodes.remove(first);            
            first = nodes.get(0); 
            first.setTarget(null);
            if( nodes.size() > 1 )
            {
                second = nodes.get(1);
                second.setTarget(first);
                if( nodes.get(2) == null )
                {
                    second = last;
                }
            }

        }

    }
}

