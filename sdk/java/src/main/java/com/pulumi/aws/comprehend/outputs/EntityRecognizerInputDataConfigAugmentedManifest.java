// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.comprehend.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EntityRecognizerInputDataConfigAugmentedManifest {
    /**
     * @return Location of annotation files.
     * 
     */
    private @Nullable String annotationDataS3Uri;
    /**
     * @return The JSON attribute that contains the annotations for the training documents.
     * 
     */
    private List<String> attributeNames;
    /**
     * @return Type of augmented manifest.
     * One of `PLAIN_TEXT_DOCUMENT` or `SEMI_STRUCTURED_DOCUMENT`.
     * 
     */
    private @Nullable String documentType;
    /**
     * @return Location of entity list.
     * 
     */
    private String s3Uri;
    /**
     * @return Location of source PDF files.
     * 
     */
    private @Nullable String sourceDocumentsS3Uri;
    /**
     * @return Purpose of data in augmented manifest.
     * One of `TRAIN` or `TEST`.
     * 
     */
    private @Nullable String split;

    private EntityRecognizerInputDataConfigAugmentedManifest() {}
    /**
     * @return Location of annotation files.
     * 
     */
    public Optional<String> annotationDataS3Uri() {
        return Optional.ofNullable(this.annotationDataS3Uri);
    }
    /**
     * @return The JSON attribute that contains the annotations for the training documents.
     * 
     */
    public List<String> attributeNames() {
        return this.attributeNames;
    }
    /**
     * @return Type of augmented manifest.
     * One of `PLAIN_TEXT_DOCUMENT` or `SEMI_STRUCTURED_DOCUMENT`.
     * 
     */
    public Optional<String> documentType() {
        return Optional.ofNullable(this.documentType);
    }
    /**
     * @return Location of entity list.
     * 
     */
    public String s3Uri() {
        return this.s3Uri;
    }
    /**
     * @return Location of source PDF files.
     * 
     */
    public Optional<String> sourceDocumentsS3Uri() {
        return Optional.ofNullable(this.sourceDocumentsS3Uri);
    }
    /**
     * @return Purpose of data in augmented manifest.
     * One of `TRAIN` or `TEST`.
     * 
     */
    public Optional<String> split() {
        return Optional.ofNullable(this.split);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntityRecognizerInputDataConfigAugmentedManifest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String annotationDataS3Uri;
        private List<String> attributeNames;
        private @Nullable String documentType;
        private String s3Uri;
        private @Nullable String sourceDocumentsS3Uri;
        private @Nullable String split;
        public Builder() {}
        public Builder(EntityRecognizerInputDataConfigAugmentedManifest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotationDataS3Uri = defaults.annotationDataS3Uri;
    	      this.attributeNames = defaults.attributeNames;
    	      this.documentType = defaults.documentType;
    	      this.s3Uri = defaults.s3Uri;
    	      this.sourceDocumentsS3Uri = defaults.sourceDocumentsS3Uri;
    	      this.split = defaults.split;
        }

        @CustomType.Setter
        public Builder annotationDataS3Uri(@Nullable String annotationDataS3Uri) {
            this.annotationDataS3Uri = annotationDataS3Uri;
            return this;
        }
        @CustomType.Setter
        public Builder attributeNames(List<String> attributeNames) {
            this.attributeNames = Objects.requireNonNull(attributeNames);
            return this;
        }
        public Builder attributeNames(String... attributeNames) {
            return attributeNames(List.of(attributeNames));
        }
        @CustomType.Setter
        public Builder documentType(@Nullable String documentType) {
            this.documentType = documentType;
            return this;
        }
        @CustomType.Setter
        public Builder s3Uri(String s3Uri) {
            this.s3Uri = Objects.requireNonNull(s3Uri);
            return this;
        }
        @CustomType.Setter
        public Builder sourceDocumentsS3Uri(@Nullable String sourceDocumentsS3Uri) {
            this.sourceDocumentsS3Uri = sourceDocumentsS3Uri;
            return this;
        }
        @CustomType.Setter
        public Builder split(@Nullable String split) {
            this.split = split;
            return this;
        }
        public EntityRecognizerInputDataConfigAugmentedManifest build() {
            final var o = new EntityRecognizerInputDataConfigAugmentedManifest();
            o.annotationDataS3Uri = annotationDataS3Uri;
            o.attributeNames = attributeNames;
            o.documentType = documentType;
            o.s3Uri = s3Uri;
            o.sourceDocumentsS3Uri = sourceDocumentsS3Uri;
            o.split = split;
            return o;
        }
    }
}
