// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.inputs;

import com.pulumi.aws.kendra.inputs.IndexDocumentMetadataConfigurationUpdateRelevanceArgs;
import com.pulumi.aws.kendra.inputs.IndexDocumentMetadataConfigurationUpdateSearchArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IndexDocumentMetadataConfigurationUpdateArgs extends com.pulumi.resources.ResourceArgs {

    public static final IndexDocumentMetadataConfigurationUpdateArgs Empty = new IndexDocumentMetadataConfigurationUpdateArgs();

    /**
     * The name of the index field. Minimum length of 1. Maximum length of 30.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the index field. Minimum length of 1. Maximum length of 30.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * A block that provides manual tuning parameters to determine how the field affects the search results. Detailed below
     * 
     */
    @Import(name="relevance")
    private @Nullable Output<IndexDocumentMetadataConfigurationUpdateRelevanceArgs> relevance;

    /**
     * @return A block that provides manual tuning parameters to determine how the field affects the search results. Detailed below
     * 
     */
    public Optional<Output<IndexDocumentMetadataConfigurationUpdateRelevanceArgs>> relevance() {
        return Optional.ofNullable(this.relevance);
    }

    /**
     * A block that provides information about how the field is used during a search. Documented below. Detailed below
     * 
     */
    @Import(name="search")
    private @Nullable Output<IndexDocumentMetadataConfigurationUpdateSearchArgs> search;

    /**
     * @return A block that provides information about how the field is used during a search. Documented below. Detailed below
     * 
     */
    public Optional<Output<IndexDocumentMetadataConfigurationUpdateSearchArgs>> search() {
        return Optional.ofNullable(this.search);
    }

    /**
     * The data type of the index field. Valid values are `STRING_VALUE`, `STRING_LIST_VALUE`, `LONG_VALUE`, `DATE_VALUE`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The data type of the index field. Valid values are `STRING_VALUE`, `STRING_LIST_VALUE`, `LONG_VALUE`, `DATE_VALUE`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private IndexDocumentMetadataConfigurationUpdateArgs() {}

    private IndexDocumentMetadataConfigurationUpdateArgs(IndexDocumentMetadataConfigurationUpdateArgs $) {
        this.name = $.name;
        this.relevance = $.relevance;
        this.search = $.search;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IndexDocumentMetadataConfigurationUpdateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IndexDocumentMetadataConfigurationUpdateArgs $;

        public Builder() {
            $ = new IndexDocumentMetadataConfigurationUpdateArgs();
        }

        public Builder(IndexDocumentMetadataConfigurationUpdateArgs defaults) {
            $ = new IndexDocumentMetadataConfigurationUpdateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the index field. Minimum length of 1. Maximum length of 30.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the index field. Minimum length of 1. Maximum length of 30.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param relevance A block that provides manual tuning parameters to determine how the field affects the search results. Detailed below
         * 
         * @return builder
         * 
         */
        public Builder relevance(@Nullable Output<IndexDocumentMetadataConfigurationUpdateRelevanceArgs> relevance) {
            $.relevance = relevance;
            return this;
        }

        /**
         * @param relevance A block that provides manual tuning parameters to determine how the field affects the search results. Detailed below
         * 
         * @return builder
         * 
         */
        public Builder relevance(IndexDocumentMetadataConfigurationUpdateRelevanceArgs relevance) {
            return relevance(Output.of(relevance));
        }

        /**
         * @param search A block that provides information about how the field is used during a search. Documented below. Detailed below
         * 
         * @return builder
         * 
         */
        public Builder search(@Nullable Output<IndexDocumentMetadataConfigurationUpdateSearchArgs> search) {
            $.search = search;
            return this;
        }

        /**
         * @param search A block that provides information about how the field is used during a search. Documented below. Detailed below
         * 
         * @return builder
         * 
         */
        public Builder search(IndexDocumentMetadataConfigurationUpdateSearchArgs search) {
            return search(Output.of(search));
        }

        /**
         * @param type The data type of the index field. Valid values are `STRING_VALUE`, `STRING_LIST_VALUE`, `LONG_VALUE`, `DATE_VALUE`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The data type of the index field. Valid values are `STRING_VALUE`, `STRING_LIST_VALUE`, `LONG_VALUE`, `DATE_VALUE`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public IndexDocumentMetadataConfigurationUpdateArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
