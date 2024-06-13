class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> out = new ArrayList<>();

        Map<Integer,List<Integer>> temp = new HashMap<>();

        for(int i=0; i<groupSizes.length; i++){
            List<Integer> list1 = new ArrayList<>();
            
            if(temp.containsKey(groupSizes[i])){
                list1 = temp.get(groupSizes[i]);
            }
            list1.add(i);
            temp.put(groupSizes[i], list1);
        }

        for(int key : temp.keySet()){
            int i = 0;
            List<Integer> inp = temp.get(key);

            while(i < inp.size()){
                List<Integer> list2 = new ArrayList<>();
                for(int j=i; j<i+key; j++){
                    list2.add(inp.get(j));
                }
                i += key;
                out.add(list2);
            }
            
        }
        return out;
    }
}
