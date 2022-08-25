// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.outputs;

import com.pulumi.aws.lex.outputs.GetSlotTypeEnumerationValue;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSlotTypeResult {
    /**
     * @return Checksum identifying the version of the slot type that was created. The checksum is
     * not included as an argument because the resource will add it automatically when updating the slot type.
     * 
     */
    private String checksum;
    /**
     * @return The date when the slot type version was created.
     * 
     */
    private String createdDate;
    /**
     * @return A description of the slot type.
     * 
     */
    private String description;
    /**
     * @return A set of EnumerationValue objects that defines the values that
     * the slot type can take. Each value can have a set of synonyms, which are additional values that help
     * train the machine learning model about the values that it resolves for a slot.
     * 
     */
    private List<GetSlotTypeEnumerationValue> enumerationValues;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The date when the $LATEST version of this slot type was updated.
     * 
     */
    private String lastUpdatedDate;
    /**
     * @return The name of the slot type. The name is not case sensitive.
     * 
     */
    private String name;
    /**
     * @return Determines the slot resolution strategy that Amazon Lex
     * uses to return slot type values. `ORIGINAL_VALUE` returns the value entered by the user if the user
     * value is similar to the slot value. `TOP_RESOLUTION` returns the first value in the resolution list
     * if there is a resolution list for the slot, otherwise null is returned.
     * 
     */
    private String valueSelectionStrategy;
    /**
     * @return The version of the slot type.
     * 
     */
    private @Nullable String version;

    private GetSlotTypeResult() {}
    /**
     * @return Checksum identifying the version of the slot type that was created. The checksum is
     * not included as an argument because the resource will add it automatically when updating the slot type.
     * 
     */
    public String checksum() {
        return this.checksum;
    }
    /**
     * @return The date when the slot type version was created.
     * 
     */
    public String createdDate() {
        return this.createdDate;
    }
    /**
     * @return A description of the slot type.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return A set of EnumerationValue objects that defines the values that
     * the slot type can take. Each value can have a set of synonyms, which are additional values that help
     * train the machine learning model about the values that it resolves for a slot.
     * 
     */
    public List<GetSlotTypeEnumerationValue> enumerationValues() {
        return this.enumerationValues;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The date when the $LATEST version of this slot type was updated.
     * 
     */
    public String lastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    /**
     * @return The name of the slot type. The name is not case sensitive.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Determines the slot resolution strategy that Amazon Lex
     * uses to return slot type values. `ORIGINAL_VALUE` returns the value entered by the user if the user
     * value is similar to the slot value. `TOP_RESOLUTION` returns the first value in the resolution list
     * if there is a resolution list for the slot, otherwise null is returned.
     * 
     */
    public String valueSelectionStrategy() {
        return this.valueSelectionStrategy;
    }
    /**
     * @return The version of the slot type.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSlotTypeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String checksum;
        private String createdDate;
        private String description;
        private List<GetSlotTypeEnumerationValue> enumerationValues;
        private String id;
        private String lastUpdatedDate;
        private String name;
        private String valueSelectionStrategy;
        private @Nullable String version;
        public Builder() {}
        public Builder(GetSlotTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checksum = defaults.checksum;
    	      this.createdDate = defaults.createdDate;
    	      this.description = defaults.description;
    	      this.enumerationValues = defaults.enumerationValues;
    	      this.id = defaults.id;
    	      this.lastUpdatedDate = defaults.lastUpdatedDate;
    	      this.name = defaults.name;
    	      this.valueSelectionStrategy = defaults.valueSelectionStrategy;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder checksum(String checksum) {
            this.checksum = Objects.requireNonNull(checksum);
            return this;
        }
        @CustomType.Setter
        public Builder createdDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder enumerationValues(List<GetSlotTypeEnumerationValue> enumerationValues) {
            this.enumerationValues = Objects.requireNonNull(enumerationValues);
            return this;
        }
        public Builder enumerationValues(GetSlotTypeEnumerationValue... enumerationValues) {
            return enumerationValues(List.of(enumerationValues));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder lastUpdatedDate(String lastUpdatedDate) {
            this.lastUpdatedDate = Objects.requireNonNull(lastUpdatedDate);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder valueSelectionStrategy(String valueSelectionStrategy) {
            this.valueSelectionStrategy = Objects.requireNonNull(valueSelectionStrategy);
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public GetSlotTypeResult build() {
            final var o = new GetSlotTypeResult();
            o.checksum = checksum;
            o.createdDate = createdDate;
            o.description = description;
            o.enumerationValues = enumerationValues;
            o.id = id;
            o.lastUpdatedDate = lastUpdatedDate;
            o.name = name;
            o.valueSelectionStrategy = valueSelectionStrategy;
            o.version = version;
            return o;
        }
    }
}
