package Design_Patterns.ImmutableCLass;

import java.util.List;
import java.util.Objects;

public final class ImmutableStudentClass implements ImmutableStudent{
    private final String name;
    private final List<String> subjects;
    public ImmutableStudentClass(String name, List<String> subjects){
        if(Objects.isNull(subjects)){
            throw new IllegalArgumentException("Needs Subjects to have something null is not expected");
        }
        this.name = name;
        this.subjects = List.copyOf(subjects);
    }
    public List<String> getSubjects(){
        return subjects;
    }
}
