class Element implements Comparable<Element>{
    char ch;
    int freq;

    public Element(char ch, int freq){
        this.ch = ch;
        this.freq = freq;
    }
    public int compareTo(Element that){
        return that.freq - this.freq;
    }
}

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch: s.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Element> pq = new PriorityQueue<>();
        for(Map.Entry<Character, Integer> entry: hm.entrySet()){
            Element ele = new Element(entry.getKey(), entry.getValue());
            pq.offer(ele);
        }
        StringBuilder str = new StringBuilder();
        while(pq.size()>0){
            Element ele = pq.poll();
            while(ele.freq>0){
                str.append(ele.ch);
                ele.freq--;
            }
        }
        return str.toString();
    }
}
