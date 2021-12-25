package leetCode.contests.biweekly_contest_68;

import java.util.*;

//https://leetcode.com/contest/biweekly-contest-68/problems/find-all-possible-recipes-from-given-supplies/
public class FindAllRecipies {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        
        List<String> res = new ArrayList<String>();
        List<String> suppli = new ArrayList<String>(Arrays.asList(supplies));
        List<String> recipi = new ArrayList<String>(Arrays.asList(recipes));
        
        int before = recipi.size() , after = 0;
        while(before != after){
            before = recipi.size();
            for(int i=0; i<recipi.size(); i++ ){
                String recipe = recipi.get(i);
                List<String> ings = ingredients.get(i);

                if(suppli.containsAll(ings)){
                    if(!suppli.contains(recipe))
                        suppli.add(recipe);
                    if(!res.contains(recipe))
                        res.add(recipe);
                    recipi.remove(recipe);
                }
            }
            after= recipi.size();
        }
        
        
        return res;
    }
}
