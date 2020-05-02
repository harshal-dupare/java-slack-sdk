package com.slack.api.scim.response;

import com.slack.api.scim.SCIMApiResponse;
import com.slack.api.scim.model.Group;
import lombok.Data;

@Data
@EqualsAndHashCode(callSuper = false)
public class GroupsPatchResponse extends Group implements SCIMApiResponse {
}
