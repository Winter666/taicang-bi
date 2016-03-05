package tiger.common.data.persistence;

import tiger.common.data.dataobject.PopulationSchoolDO;

import java.util.List;

/**
 * Created by Eason on 2016/3/5.
 */
public interface SchoolPredictionMapper {

    List<PopulationSchoolDO> getSchoolList();
}
