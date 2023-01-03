package com.company;

import java.util.*;

public class wordLader {
    int solution(String beginWord, String endWord, String[] wordList) {
        List<String> words = Arrays.asList(wordList);
        Map<String,List<String>> map = new HashMap<>(); // 'h*t' -> [hit,hot]
        for(int i = 0; i <beginWord.length(); ++i){
            StringBuilder tmp = new StringBuilder();
            tmp.append(beginWord.substring(0,i));
            tmp.append('*');
            tmp.append(beginWord.substring(i+1));
            String str = tmp.toString();
            map.computeIfAbsent(str,k -> new ArrayList<>()).add(beginWord);
        }

        for(String w: words){
            for(int i = 0; i <w.length(); ++i){
                StringBuilder tmp = new StringBuilder();
                tmp.append(w.substring(0,i));
                tmp.append('*');
                tmp.append(w.substring(i+1));
                String str = tmp.toString();
                map.computeIfAbsent(str,k -> new ArrayList<>()).add(w);
            }
        }

        Queue<String> queue = new ArrayDeque<>();
        queue.offer(beginWord);
        int count = 0;
        Set<String> visited = new HashSet<>();
        while(!queue.isEmpty()){
            count++;
            int size = queue.size();
            for(int iter = 0; iter < size; ++iter){
                String cur = queue.poll();
                if(cur.equals(endWord)) return count;
                for(int i = 0; i < cur.length(); ++i){
                    StringBuilder tmp = new StringBuilder();
                    tmp.append(cur.substring(0,i));
                    tmp.append('*');
                    tmp.append(cur.substring(i+1));
                    String str = tmp.toString();
                    if(map.containsKey(str)){
                        for(String s : map.get(str)){
                            if(!visited.contains(s)){
                                visited.add(s);
                                queue.offer(s);
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

}
