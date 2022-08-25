// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.outputs;

import com.pulumi.aws.iot.outputs.TopicRuleErrorActionCloudwatchAlarm;
import com.pulumi.aws.iot.outputs.TopicRuleErrorActionCloudwatchLogs;
import com.pulumi.aws.iot.outputs.TopicRuleErrorActionCloudwatchMetric;
import com.pulumi.aws.iot.outputs.TopicRuleErrorActionDynamodb;
import com.pulumi.aws.iot.outputs.TopicRuleErrorActionDynamodbv2;
import com.pulumi.aws.iot.outputs.TopicRuleErrorActionElasticsearch;
import com.pulumi.aws.iot.outputs.TopicRuleErrorActionFirehose;
import com.pulumi.aws.iot.outputs.TopicRuleErrorActionHttp;
import com.pulumi.aws.iot.outputs.TopicRuleErrorActionIotAnalytics;
import com.pulumi.aws.iot.outputs.TopicRuleErrorActionIotEvents;
import com.pulumi.aws.iot.outputs.TopicRuleErrorActionKafka;
import com.pulumi.aws.iot.outputs.TopicRuleErrorActionKinesis;
import com.pulumi.aws.iot.outputs.TopicRuleErrorActionLambda;
import com.pulumi.aws.iot.outputs.TopicRuleErrorActionRepublish;
import com.pulumi.aws.iot.outputs.TopicRuleErrorActionS3;
import com.pulumi.aws.iot.outputs.TopicRuleErrorActionSns;
import com.pulumi.aws.iot.outputs.TopicRuleErrorActionSqs;
import com.pulumi.aws.iot.outputs.TopicRuleErrorActionStepFunctions;
import com.pulumi.aws.iot.outputs.TopicRuleErrorActionTimestream;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TopicRuleErrorAction {
    private @Nullable TopicRuleErrorActionCloudwatchAlarm cloudwatchAlarm;
    private @Nullable TopicRuleErrorActionCloudwatchLogs cloudwatchLogs;
    private @Nullable TopicRuleErrorActionCloudwatchMetric cloudwatchMetric;
    private @Nullable TopicRuleErrorActionDynamodb dynamodb;
    private @Nullable TopicRuleErrorActionDynamodbv2 dynamodbv2;
    private @Nullable TopicRuleErrorActionElasticsearch elasticsearch;
    private @Nullable TopicRuleErrorActionFirehose firehose;
    private @Nullable TopicRuleErrorActionHttp http;
    private @Nullable TopicRuleErrorActionIotAnalytics iotAnalytics;
    private @Nullable TopicRuleErrorActionIotEvents iotEvents;
    private @Nullable TopicRuleErrorActionKafka kafka;
    private @Nullable TopicRuleErrorActionKinesis kinesis;
    private @Nullable TopicRuleErrorActionLambda lambda;
    private @Nullable TopicRuleErrorActionRepublish republish;
    private @Nullable TopicRuleErrorActionS3 s3;
    private @Nullable TopicRuleErrorActionSns sns;
    private @Nullable TopicRuleErrorActionSqs sqs;
    private @Nullable TopicRuleErrorActionStepFunctions stepFunctions;
    private @Nullable TopicRuleErrorActionTimestream timestream;

    private TopicRuleErrorAction() {}
    public Optional<TopicRuleErrorActionCloudwatchAlarm> cloudwatchAlarm() {
        return Optional.ofNullable(this.cloudwatchAlarm);
    }
    public Optional<TopicRuleErrorActionCloudwatchLogs> cloudwatchLogs() {
        return Optional.ofNullable(this.cloudwatchLogs);
    }
    public Optional<TopicRuleErrorActionCloudwatchMetric> cloudwatchMetric() {
        return Optional.ofNullable(this.cloudwatchMetric);
    }
    public Optional<TopicRuleErrorActionDynamodb> dynamodb() {
        return Optional.ofNullable(this.dynamodb);
    }
    public Optional<TopicRuleErrorActionDynamodbv2> dynamodbv2() {
        return Optional.ofNullable(this.dynamodbv2);
    }
    public Optional<TopicRuleErrorActionElasticsearch> elasticsearch() {
        return Optional.ofNullable(this.elasticsearch);
    }
    public Optional<TopicRuleErrorActionFirehose> firehose() {
        return Optional.ofNullable(this.firehose);
    }
    public Optional<TopicRuleErrorActionHttp> http() {
        return Optional.ofNullable(this.http);
    }
    public Optional<TopicRuleErrorActionIotAnalytics> iotAnalytics() {
        return Optional.ofNullable(this.iotAnalytics);
    }
    public Optional<TopicRuleErrorActionIotEvents> iotEvents() {
        return Optional.ofNullable(this.iotEvents);
    }
    public Optional<TopicRuleErrorActionKafka> kafka() {
        return Optional.ofNullable(this.kafka);
    }
    public Optional<TopicRuleErrorActionKinesis> kinesis() {
        return Optional.ofNullable(this.kinesis);
    }
    public Optional<TopicRuleErrorActionLambda> lambda() {
        return Optional.ofNullable(this.lambda);
    }
    public Optional<TopicRuleErrorActionRepublish> republish() {
        return Optional.ofNullable(this.republish);
    }
    public Optional<TopicRuleErrorActionS3> s3() {
        return Optional.ofNullable(this.s3);
    }
    public Optional<TopicRuleErrorActionSns> sns() {
        return Optional.ofNullable(this.sns);
    }
    public Optional<TopicRuleErrorActionSqs> sqs() {
        return Optional.ofNullable(this.sqs);
    }
    public Optional<TopicRuleErrorActionStepFunctions> stepFunctions() {
        return Optional.ofNullable(this.stepFunctions);
    }
    public Optional<TopicRuleErrorActionTimestream> timestream() {
        return Optional.ofNullable(this.timestream);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable TopicRuleErrorActionCloudwatchAlarm cloudwatchAlarm;
        private @Nullable TopicRuleErrorActionCloudwatchLogs cloudwatchLogs;
        private @Nullable TopicRuleErrorActionCloudwatchMetric cloudwatchMetric;
        private @Nullable TopicRuleErrorActionDynamodb dynamodb;
        private @Nullable TopicRuleErrorActionDynamodbv2 dynamodbv2;
        private @Nullable TopicRuleErrorActionElasticsearch elasticsearch;
        private @Nullable TopicRuleErrorActionFirehose firehose;
        private @Nullable TopicRuleErrorActionHttp http;
        private @Nullable TopicRuleErrorActionIotAnalytics iotAnalytics;
        private @Nullable TopicRuleErrorActionIotEvents iotEvents;
        private @Nullable TopicRuleErrorActionKafka kafka;
        private @Nullable TopicRuleErrorActionKinesis kinesis;
        private @Nullable TopicRuleErrorActionLambda lambda;
        private @Nullable TopicRuleErrorActionRepublish republish;
        private @Nullable TopicRuleErrorActionS3 s3;
        private @Nullable TopicRuleErrorActionSns sns;
        private @Nullable TopicRuleErrorActionSqs sqs;
        private @Nullable TopicRuleErrorActionStepFunctions stepFunctions;
        private @Nullable TopicRuleErrorActionTimestream timestream;
        public Builder() {}
        public Builder(TopicRuleErrorAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchAlarm = defaults.cloudwatchAlarm;
    	      this.cloudwatchLogs = defaults.cloudwatchLogs;
    	      this.cloudwatchMetric = defaults.cloudwatchMetric;
    	      this.dynamodb = defaults.dynamodb;
    	      this.dynamodbv2 = defaults.dynamodbv2;
    	      this.elasticsearch = defaults.elasticsearch;
    	      this.firehose = defaults.firehose;
    	      this.http = defaults.http;
    	      this.iotAnalytics = defaults.iotAnalytics;
    	      this.iotEvents = defaults.iotEvents;
    	      this.kafka = defaults.kafka;
    	      this.kinesis = defaults.kinesis;
    	      this.lambda = defaults.lambda;
    	      this.republish = defaults.republish;
    	      this.s3 = defaults.s3;
    	      this.sns = defaults.sns;
    	      this.sqs = defaults.sqs;
    	      this.stepFunctions = defaults.stepFunctions;
    	      this.timestream = defaults.timestream;
        }

        @CustomType.Setter
        public Builder cloudwatchAlarm(@Nullable TopicRuleErrorActionCloudwatchAlarm cloudwatchAlarm) {
            this.cloudwatchAlarm = cloudwatchAlarm;
            return this;
        }
        @CustomType.Setter
        public Builder cloudwatchLogs(@Nullable TopicRuleErrorActionCloudwatchLogs cloudwatchLogs) {
            this.cloudwatchLogs = cloudwatchLogs;
            return this;
        }
        @CustomType.Setter
        public Builder cloudwatchMetric(@Nullable TopicRuleErrorActionCloudwatchMetric cloudwatchMetric) {
            this.cloudwatchMetric = cloudwatchMetric;
            return this;
        }
        @CustomType.Setter
        public Builder dynamodb(@Nullable TopicRuleErrorActionDynamodb dynamodb) {
            this.dynamodb = dynamodb;
            return this;
        }
        @CustomType.Setter
        public Builder dynamodbv2(@Nullable TopicRuleErrorActionDynamodbv2 dynamodbv2) {
            this.dynamodbv2 = dynamodbv2;
            return this;
        }
        @CustomType.Setter
        public Builder elasticsearch(@Nullable TopicRuleErrorActionElasticsearch elasticsearch) {
            this.elasticsearch = elasticsearch;
            return this;
        }
        @CustomType.Setter
        public Builder firehose(@Nullable TopicRuleErrorActionFirehose firehose) {
            this.firehose = firehose;
            return this;
        }
        @CustomType.Setter
        public Builder http(@Nullable TopicRuleErrorActionHttp http) {
            this.http = http;
            return this;
        }
        @CustomType.Setter
        public Builder iotAnalytics(@Nullable TopicRuleErrorActionIotAnalytics iotAnalytics) {
            this.iotAnalytics = iotAnalytics;
            return this;
        }
        @CustomType.Setter
        public Builder iotEvents(@Nullable TopicRuleErrorActionIotEvents iotEvents) {
            this.iotEvents = iotEvents;
            return this;
        }
        @CustomType.Setter
        public Builder kafka(@Nullable TopicRuleErrorActionKafka kafka) {
            this.kafka = kafka;
            return this;
        }
        @CustomType.Setter
        public Builder kinesis(@Nullable TopicRuleErrorActionKinesis kinesis) {
            this.kinesis = kinesis;
            return this;
        }
        @CustomType.Setter
        public Builder lambda(@Nullable TopicRuleErrorActionLambda lambda) {
            this.lambda = lambda;
            return this;
        }
        @CustomType.Setter
        public Builder republish(@Nullable TopicRuleErrorActionRepublish republish) {
            this.republish = republish;
            return this;
        }
        @CustomType.Setter
        public Builder s3(@Nullable TopicRuleErrorActionS3 s3) {
            this.s3 = s3;
            return this;
        }
        @CustomType.Setter
        public Builder sns(@Nullable TopicRuleErrorActionSns sns) {
            this.sns = sns;
            return this;
        }
        @CustomType.Setter
        public Builder sqs(@Nullable TopicRuleErrorActionSqs sqs) {
            this.sqs = sqs;
            return this;
        }
        @CustomType.Setter
        public Builder stepFunctions(@Nullable TopicRuleErrorActionStepFunctions stepFunctions) {
            this.stepFunctions = stepFunctions;
            return this;
        }
        @CustomType.Setter
        public Builder timestream(@Nullable TopicRuleErrorActionTimestream timestream) {
            this.timestream = timestream;
            return this;
        }
        public TopicRuleErrorAction build() {
            final var o = new TopicRuleErrorAction();
            o.cloudwatchAlarm = cloudwatchAlarm;
            o.cloudwatchLogs = cloudwatchLogs;
            o.cloudwatchMetric = cloudwatchMetric;
            o.dynamodb = dynamodb;
            o.dynamodbv2 = dynamodbv2;
            o.elasticsearch = elasticsearch;
            o.firehose = firehose;
            o.http = http;
            o.iotAnalytics = iotAnalytics;
            o.iotEvents = iotEvents;
            o.kafka = kafka;
            o.kinesis = kinesis;
            o.lambda = lambda;
            o.republish = republish;
            o.s3 = s3;
            o.sns = sns;
            o.sqs = sqs;
            o.stepFunctions = stepFunctions;
            o.timestream = timestream;
            return o;
        }
    }
}
