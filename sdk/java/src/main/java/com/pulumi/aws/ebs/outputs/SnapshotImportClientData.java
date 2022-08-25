// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ebs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SnapshotImportClientData {
    /**
     * @return A user-defined comment about the disk upload.
     * 
     */
    private @Nullable String comment;
    /**
     * @return The time that the disk upload ends.
     * 
     */
    private @Nullable String uploadEnd;
    /**
     * @return The size of the uploaded disk image, in GiB.
     * 
     */
    private @Nullable Double uploadSize;
    /**
     * @return The time that the disk upload starts.
     * 
     */
    private @Nullable String uploadStart;

    private SnapshotImportClientData() {}
    /**
     * @return A user-defined comment about the disk upload.
     * 
     */
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    /**
     * @return The time that the disk upload ends.
     * 
     */
    public Optional<String> uploadEnd() {
        return Optional.ofNullable(this.uploadEnd);
    }
    /**
     * @return The size of the uploaded disk image, in GiB.
     * 
     */
    public Optional<Double> uploadSize() {
        return Optional.ofNullable(this.uploadSize);
    }
    /**
     * @return The time that the disk upload starts.
     * 
     */
    public Optional<String> uploadStart() {
        return Optional.ofNullable(this.uploadStart);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotImportClientData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String comment;
        private @Nullable String uploadEnd;
        private @Nullable Double uploadSize;
        private @Nullable String uploadStart;
        public Builder() {}
        public Builder(SnapshotImportClientData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.uploadEnd = defaults.uploadEnd;
    	      this.uploadSize = defaults.uploadSize;
    	      this.uploadStart = defaults.uploadStart;
        }

        @CustomType.Setter
        public Builder comment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder uploadEnd(@Nullable String uploadEnd) {
            this.uploadEnd = uploadEnd;
            return this;
        }
        @CustomType.Setter
        public Builder uploadSize(@Nullable Double uploadSize) {
            this.uploadSize = uploadSize;
            return this;
        }
        @CustomType.Setter
        public Builder uploadStart(@Nullable String uploadStart) {
            this.uploadStart = uploadStart;
            return this;
        }
        public SnapshotImportClientData build() {
            final var o = new SnapshotImportClientData();
            o.comment = comment;
            o.uploadEnd = uploadEnd;
            o.uploadSize = uploadSize;
            o.uploadStart = uploadStart;
            return o;
        }
    }
}
