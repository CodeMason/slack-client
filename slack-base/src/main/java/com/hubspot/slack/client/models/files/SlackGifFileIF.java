package com.hubspot.slack.client.models.files;

import org.immutables.value.Value.Default;
import org.immutables.value.Value.Immutable;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hubspot.immutables.style.HubSpotStyle;

@Immutable
@HubSpotStyle
@JsonNaming(SnakeCaseStrategy.class)
public interface SlackGifFileIF extends SlackImageFile {
  @Default
  @Override
  default SlackFileTypes getFiletype() {
    return SlackFileTypes.GIF;
  }
}
