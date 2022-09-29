package com.slack.api.app_backend.views.response;

import com.slack.api.model.Attachment;
import com.slack.api.model.Message;
import com.slack.api.model.block.LayoutBlock;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InputBlockResponse {
    private String responseType; // ephemeral, in_channel
    private String text;
    private List<Attachment> attachments;
    private List<LayoutBlock> blocks;
    private Message.Metadata metadata;
}
