// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StaticWebLayerCloudwatchConfigurationLogStream {
    private @Nullable Integer batchCount;
    private @Nullable Integer batchSize;
    private @Nullable Integer bufferDuration;
    private @Nullable String datetimeFormat;
    private @Nullable String encoding;
    private String file;
    private @Nullable String fileFingerprintLines;
    private @Nullable String initialPosition;
    private String logGroupName;
    private @Nullable String multilineStartPattern;
    private @Nullable String timeZone;

    private StaticWebLayerCloudwatchConfigurationLogStream() {}
    public Optional<Integer> batchCount() {
        return Optional.ofNullable(this.batchCount);
    }
    public Optional<Integer> batchSize() {
        return Optional.ofNullable(this.batchSize);
    }
    public Optional<Integer> bufferDuration() {
        return Optional.ofNullable(this.bufferDuration);
    }
    public Optional<String> datetimeFormat() {
        return Optional.ofNullable(this.datetimeFormat);
    }
    public Optional<String> encoding() {
        return Optional.ofNullable(this.encoding);
    }
    public String file() {
        return this.file;
    }
    public Optional<String> fileFingerprintLines() {
        return Optional.ofNullable(this.fileFingerprintLines);
    }
    public Optional<String> initialPosition() {
        return Optional.ofNullable(this.initialPosition);
    }
    public String logGroupName() {
        return this.logGroupName;
    }
    public Optional<String> multilineStartPattern() {
        return Optional.ofNullable(this.multilineStartPattern);
    }
    public Optional<String> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticWebLayerCloudwatchConfigurationLogStream defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer batchCount;
        private @Nullable Integer batchSize;
        private @Nullable Integer bufferDuration;
        private @Nullable String datetimeFormat;
        private @Nullable String encoding;
        private String file;
        private @Nullable String fileFingerprintLines;
        private @Nullable String initialPosition;
        private String logGroupName;
        private @Nullable String multilineStartPattern;
        private @Nullable String timeZone;
        public Builder() {}
        public Builder(StaticWebLayerCloudwatchConfigurationLogStream defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchCount = defaults.batchCount;
    	      this.batchSize = defaults.batchSize;
    	      this.bufferDuration = defaults.bufferDuration;
    	      this.datetimeFormat = defaults.datetimeFormat;
    	      this.encoding = defaults.encoding;
    	      this.file = defaults.file;
    	      this.fileFingerprintLines = defaults.fileFingerprintLines;
    	      this.initialPosition = defaults.initialPosition;
    	      this.logGroupName = defaults.logGroupName;
    	      this.multilineStartPattern = defaults.multilineStartPattern;
    	      this.timeZone = defaults.timeZone;
        }

        @CustomType.Setter
        public Builder batchCount(@Nullable Integer batchCount) {
            this.batchCount = batchCount;
            return this;
        }
        @CustomType.Setter
        public Builder batchSize(@Nullable Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        @CustomType.Setter
        public Builder bufferDuration(@Nullable Integer bufferDuration) {
            this.bufferDuration = bufferDuration;
            return this;
        }
        @CustomType.Setter
        public Builder datetimeFormat(@Nullable String datetimeFormat) {
            this.datetimeFormat = datetimeFormat;
            return this;
        }
        @CustomType.Setter
        public Builder encoding(@Nullable String encoding) {
            this.encoding = encoding;
            return this;
        }
        @CustomType.Setter
        public Builder file(String file) {
            this.file = Objects.requireNonNull(file);
            return this;
        }
        @CustomType.Setter
        public Builder fileFingerprintLines(@Nullable String fileFingerprintLines) {
            this.fileFingerprintLines = fileFingerprintLines;
            return this;
        }
        @CustomType.Setter
        public Builder initialPosition(@Nullable String initialPosition) {
            this.initialPosition = initialPosition;
            return this;
        }
        @CustomType.Setter
        public Builder logGroupName(String logGroupName) {
            this.logGroupName = Objects.requireNonNull(logGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder multilineStartPattern(@Nullable String multilineStartPattern) {
            this.multilineStartPattern = multilineStartPattern;
            return this;
        }
        @CustomType.Setter
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public StaticWebLayerCloudwatchConfigurationLogStream build() {
            final var o = new StaticWebLayerCloudwatchConfigurationLogStream();
            o.batchCount = batchCount;
            o.batchSize = batchSize;
            o.bufferDuration = bufferDuration;
            o.datetimeFormat = datetimeFormat;
            o.encoding = encoding;
            o.file = file;
            o.fileFingerprintLines = fileFingerprintLines;
            o.initialPosition = initialPosition;
            o.logGroupName = logGroupName;
            o.multilineStartPattern = multilineStartPattern;
            o.timeZone = timeZone;
            return o;
        }
    }
}
