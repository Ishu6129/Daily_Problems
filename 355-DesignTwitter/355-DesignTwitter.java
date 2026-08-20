// Last updated: 8/20/2026, 11:04:08 PM
1class Twitter {
2    int twt;
3    Map<Integer, List<int[]>> tweets;
4    Map<Integer,Set<Integer>> map;
5    public Twitter() {
6        twt=0;
7        tweets=new HashMap<>();
8        map=new HashMap<>();
9    }
10    
11    public void postTweet(int userId, int tweetId) {
12        tweets.putIfAbsent(userId,new ArrayList<>());
13        tweets.get(userId).add(new int[]{tweetId,twt});
14        twt++;
15    }
16    
17    public List<Integer> getNewsFeed(int userId) {
18        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
19        if(tweets.containsKey(userId)) {
20            pq.addAll(tweets.get(userId));
21        }
22        if(map.containsKey(userId)){
23            for(int followeeId:map.get(userId)) {
24                if(tweets.containsKey(followeeId)) {
25                    pq.addAll(tweets.get(followeeId));
26                }   
27            }
28        }
29        List<Integer> feed=new ArrayList<>();
30        int c=0;
31        while(!pq.isEmpty() && c<10) {
32            feed.add(pq.poll()[0]);
33            c++;
34        }
35        return feed;
36    }
37    
38    public void follow(int followerId, int followeeId) {
39        if (followerId==followeeId) return;
40        map.putIfAbsent(followerId,new HashSet<>());
41        map.get(followerId).add(followeeId);
42    }
43    
44    public void unfollow(int followerId, int followeeId) {
45        if(!map.containsKey(followerId)) return;
46        map.get(followerId).remove(followeeId);
47    }
48}
49
50/**
51 * Your Twitter object will be instantiated and called as such:
52 * Twitter obj = new Twitter();
53 * obj.postTweet(userId,tweetId);
54 * List<Integer> param_2 = obj.getNewsFeed(userId);
55 * obj.follow(followerId,followeeId);
56 * obj.unfollow(followerId,followeeId);
57 */