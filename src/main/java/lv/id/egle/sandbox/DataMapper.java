package lv.id.egle.sandbox;

import org.mapstruct.Mapper;

//@Mapper
public abstract class DataMapper {

    public abstract DataTwo toDataTwo(DataOne dataOne);

}
