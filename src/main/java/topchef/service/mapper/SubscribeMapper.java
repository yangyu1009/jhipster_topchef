package topchef.service.mapper;

import topchef.service.dto.tableEntity.SubscribeDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SubscribeMapper implements RowMapper<SubscribeDto> {
    @Override
    public SubscribeDto mapRow(ResultSet resultSet, int i) throws SQLException {
        SubscribeDto subscribe = new SubscribeDto();
        subscribe.setUserId(resultSet.getString("u_id"));
        subscribe.setRecipeId(resultSet.getString("r_id"));
        return subscribe;
    }
}
