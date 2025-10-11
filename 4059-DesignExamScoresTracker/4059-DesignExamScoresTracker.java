// Last updated: 12/10/2025, 00:52:52
class ExamTracker {
    private List<Integer> times;
    private List<Long> preScores;
    public ExamTracker() {
        times=new ArrayList<>();
        preScores=new ArrayList<>();
    }
    
    public void record(int time, int score) {
        times.add(time);
        long pre= preScores.isEmpty()?0:preScores.get(preScores.size()-1);
        preScores.add(score+pre);
    }
    
    public long totalScore(int startTime, int endTime) {
        int l=left(times,startTime);
        int r=right(times,endTime)-1;
        if(l>r) return 0;
        long t=preScores.get(r);
        if(l>0){
            t-=preScores.get(l-1);
        }
        return t;
        
    }

    public int left(List<Integer> lst,int target){
        int l=0;
        int h=lst.size();
        while(l<h){
            int mid=l+(h-l)/2;
            if(lst.get(mid)<target) l=mid+1;
            else h=mid;
        }
        return l;
    }
    public int right(List<Integer> lst,int target){
        int l=0;
        int h=lst.size();
        while(l<h){
            int mid=l+(h-l)/2;
            if(lst.get(mid)<=target) l=mid+1;
            else h=mid;
        }
        return l;
    }
}

/**
 * Your ExamTracker object will be instantiated and called as such:
 * ExamTracker obj = new ExamTracker();
 * obj.record(time,score);
 * long param_2 = obj.totalScore(startTime,endTime);
 */