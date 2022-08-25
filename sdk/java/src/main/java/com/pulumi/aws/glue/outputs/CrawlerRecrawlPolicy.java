// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CrawlerRecrawlPolicy {
    /**
     * @return Specifies whether to crawl the entire dataset again, crawl only folders that were added since the last crawler run, or crawl what S3 notifies the crawler of via SQS. Valid Values are: `CRAWL_EVENT_MODE`, `CRAWL_EVERYTHING` and `CRAWL_NEW_FOLDERS_ONLY`. Default value is `CRAWL_EVERYTHING`.
     * 
     */
    private @Nullable String recrawlBehavior;

    private CrawlerRecrawlPolicy() {}
    /**
     * @return Specifies whether to crawl the entire dataset again, crawl only folders that were added since the last crawler run, or crawl what S3 notifies the crawler of via SQS. Valid Values are: `CRAWL_EVENT_MODE`, `CRAWL_EVERYTHING` and `CRAWL_NEW_FOLDERS_ONLY`. Default value is `CRAWL_EVERYTHING`.
     * 
     */
    public Optional<String> recrawlBehavior() {
        return Optional.ofNullable(this.recrawlBehavior);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CrawlerRecrawlPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String recrawlBehavior;
        public Builder() {}
        public Builder(CrawlerRecrawlPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recrawlBehavior = defaults.recrawlBehavior;
        }

        @CustomType.Setter
        public Builder recrawlBehavior(@Nullable String recrawlBehavior) {
            this.recrawlBehavior = recrawlBehavior;
            return this;
        }
        public CrawlerRecrawlPolicy build() {
            final var o = new CrawlerRecrawlPolicy();
            o.recrawlBehavior = recrawlBehavior;
            return o;
        }
    }
}
