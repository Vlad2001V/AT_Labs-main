package lab4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GenericTask {

    public static void main(String[] args){

        List<Skill> skills = new ArrayList<>();

        skills.add(new Skill(120d,11d));
        skills.add(new Skill(110d,10d));
        skills.add(new Skill(140d,40d));
        skills.add(new Skill(90d,13d));
        skills.add(new Skill(75d,130d));
        skills.add(new Skill(131d,231d));

        Comparator<Skill> skillComparator = Comparator.comparingDouble(Skill::getDamage)
                .thenComparingDouble(Skill::getCooldown);

        System.out.println(sort(skills, skillComparator));
        System.out.println(min(skills, skillComparator));
        System.out.println(max(skills, skillComparator));
    }

    public static <T> List<T> sort(Collection<T> collection, Comparator<T> comparator) {
        if (collection == null || comparator == null) {
            return null;
        }
        return collection.stream().sorted(comparator).collect(Collectors.toList());
    }

    public static <T> T min(Collection<T> collection, Comparator<T> comparator) {
        List<T> list = sort(collection, comparator);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static <T> T max(Collection<T> collection, Comparator<T> comparator) {
        List<T> list = sort(collection, comparator);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static class Skill{

        private Double damage;
        private Double cooldown;

        public Skill(Double damage, Double cooldown) {
            this.damage = damage;
            this.cooldown = cooldown;
        }

        public Double getDamage() {
            return damage;
        }

        public void setDamage(Double damage) {
            this.damage = damage;
        }

        public Double getCooldown() {
            return cooldown;
        }

        public void setCooldown(Double cooldown) {
            this.cooldown = cooldown;
        }

        @Override
        public String toString(){
            return "Skill{"+"damage="+damage+", cooldown="+cooldown+"}";
        }
    }
}
