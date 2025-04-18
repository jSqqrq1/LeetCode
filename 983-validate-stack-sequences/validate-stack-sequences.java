class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int j=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<pushed.length;i++){
            stack.push(pushed[i]);
            while(!stack.isEmpty() && j<popped.length){
                if(stack.peek() == popped[j]){
                    stack.pop();
                    j++;
                }
                else{
                    break;
                }
            }
        }
        return stack.isEmpty();
    }
}