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
public final class CustomLayerCloudwatchConfigurationLogStream {
    /**
     * @return Specifies the max number of log events in a batch, up to `10000`. The default value is `1000`.
     * 
     */
    private @Nullable Integer batchCount;
    /**
     * @return Specifies the maximum size of log events in a batch, in bytes, up to `1048576` bytes. The default value is `32768` bytes.
     * 
     */
    private @Nullable Integer batchSize;
    /**
     * @return Specifies the time duration for the batching of log events. The minimum value is `5000` and default value is `5000`.
     * 
     */
    private @Nullable Integer bufferDuration;
    /**
     * @return Specifies how the timestamp is extracted from logs. For more information, see the CloudWatch Logs Agent Reference (https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AgentReference.html).
     * 
     */
    private @Nullable String datetimeFormat;
    /**
     * @return Specifies the encoding of the log file so that the file can be read correctly. The default is `utf_8`.
     * 
     */
    private @Nullable String encoding;
    /**
     * @return Specifies log files that you want to push to CloudWatch Logs. File can point to a specific file or multiple files (by using wild card characters such as /var/log/system.log*).
     * 
     */
    private String file;
    /**
     * @return Specifies the range of lines for identifying a file. The valid values are one number, or two dash-delimited numbers, such as `1`, `2-5`. The default value is `1`.
     * 
     */
    private @Nullable String fileFingerprintLines;
    /**
     * @return Specifies where to start to read data (`start_of_file` or `end_of_file`). The default is `start_of_file`.
     * 
     */
    private @Nullable String initialPosition;
    /**
     * @return Specifies the destination log group. A log group is created automatically if it doesn&#39;t already exist.
     * 
     */
    private String logGroupName;
    /**
     * @return Specifies the pattern for identifying the start of a log message.
     * 
     */
    private @Nullable String multilineStartPattern;
    /**
     * @return Specifies the time zone of log event time stamps.
     * 
     */
    private @Nullable String timeZone;

    private CustomLayerCloudwatchConfigurationLogStream() {}
    /**
     * @return Specifies the max number of log events in a batch, up to `10000`. The default value is `1000`.
     * 
     */
    public Optional<Integer> batchCount() {
        return Optional.ofNullable(this.batchCount);
    }
    /**
     * @return Specifies the maximum size of log events in a batch, in bytes, up to `1048576` bytes. The default value is `32768` bytes.
     * 
     */
    public Optional<Integer> batchSize() {
        return Optional.ofNullable(this.batchSize);
    }
    /**
     * @return Specifies the time duration for the batching of log events. The minimum value is `5000` and default value is `5000`.
     * 
     */
    public Optional<Integer> bufferDuration() {
        return Optional.ofNullable(this.bufferDuration);
    }
    /**
     * @return Specifies how the timestamp is extracted from logs. For more information, see the CloudWatch Logs Agent Reference (https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AgentReference.html).
     * 
     */
    public Optional<String> datetimeFormat() {
        return Optional.ofNullable(this.datetimeFormat);
    }
    /**
     * @return Specifies the encoding of the log file so that the file can be read correctly. The default is `utf_8`.
     * 
     */
    public Optional<String> encoding() {
        return Optional.ofNullable(this.encoding);
    }
    /**
     * @return Specifies log files that you want to push to CloudWatch Logs. File can point to a specific file or multiple files (by using wild card characters such as /var/log/system.log*).
     * 
     */
    public String file() {
        return this.file;
    }
    /**
     * @return Specifies the range of lines for identifying a file. The valid values are one number, or two dash-delimited numbers, such as `1`, `2-5`. The default value is `1`.
     * 
     */
    public Optional<String> fileFingerprintLines() {
        return Optional.ofNullable(this.fileFingerprintLines);
    }
    /**
     * @return Specifies where to start to read data (`start_of_file` or `end_of_file`). The default is `start_of_file`.
     * 
     */
    public Optional<String> initialPosition() {
        return Optional.ofNullable(this.initialPosition);
    }
    /**
     * @return Specifies the destination log group. A log group is created automatically if it doesn&#39;t already exist.
     * 
     */
    public String logGroupName() {
        return this.logGroupName;
    }
    /**
     * @return Specifies the pattern for identifying the start of a log message.
     * 
     */
    public Optional<String> multilineStartPattern() {
        return Optional.ofNullable(this.multilineStartPattern);
    }
    /**
     * @return Specifies the time zone of log event time stamps.
     * 
     */
    public Optional<String> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomLayerCloudwatchConfigurationLogStream defaults) {
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
        public Builder(CustomLayerCloudwatchConfigurationLogStream defaults) {
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
        public CustomLayerCloudwatchConfigurationLogStream build() {
            final var o = new CustomLayerCloudwatchConfigurationLogStream();
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
