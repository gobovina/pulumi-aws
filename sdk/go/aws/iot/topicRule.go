// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package iot

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/iam"
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/iot"
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/sns"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		mytopic, err := sns.NewTopic(ctx, "mytopic", nil)
// 		if err != nil {
// 			return err
// 		}
// 		myerrortopic, err := sns.NewTopic(ctx, "myerrortopic", nil)
// 		if err != nil {
// 			return err
// 		}
// 		role, err := iam.NewRole(ctx, "role", &iam.RoleArgs{
// 			AssumeRolePolicy: pulumi.Any(fmt.Sprintf("%v%v%v%v%v%v%v%v%v%v%v%v", "{\n", "  \"Version\": \"2012-10-17\",\n", "  \"Statement\": [\n", "    {\n", "      \"Effect\": \"Allow\",\n", "      \"Principal\": {\n", "        \"Service\": \"iot.amazonaws.com\"\n", "      },\n", "      \"Action\": \"sts:AssumeRole\"\n", "    }\n", "  ]\n", "}\n")),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = iot.NewTopicRule(ctx, "rule", &iot.TopicRuleArgs{
// 			Description: pulumi.String("Example rule"),
// 			Enabled:     pulumi.Bool(true),
// 			Sql:         pulumi.String("SELECT * FROM 'topic/test'"),
// 			SqlVersion:  pulumi.String("2016-03-23"),
// 			Sns: &iot.TopicRuleSnsArgs{
// 				MessageFormat: pulumi.String("RAW"),
// 				RoleArn:       role.Arn,
// 				TargetArn:     mytopic.Arn,
// 			},
// 			ErrorAction: &iot.TopicRuleErrorActionArgs{
// 				Sns: &iot.TopicRuleErrorActionSnsArgs{
// 					MessageFormat: pulumi.String("RAW"),
// 					RoleArn:       role.Arn,
// 					TargetArn:     myerrortopic.Arn,
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = iam.NewRolePolicy(ctx, "iamPolicyForLambda", &iam.RolePolicyArgs{
// 			Role: role.ID(),
// 			Policy: mytopic.Arn.ApplyT(func(arn string) (string, error) {
// 				return fmt.Sprintf("%v%v%v%v%v%v%v%v%v%v%v%v%v%v", "{\n", "  \"Version\": \"2012-10-17\",\n", "  \"Statement\": [\n", "    {\n", "        \"Effect\": \"Allow\",\n", "        \"Action\": [\n", "            \"sns:Publish\"\n", "        ],\n", "        \"Resource\": \"", arn, "\"\n", "    }\n", "  ]\n", "}\n"), nil
// 			}).(pulumi.StringOutput),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// IoT Topic Rules can be imported using the `name`, e.g.,
//
// ```sh
//  $ pulumi import aws:iot/topicRule:TopicRule rule <name>
// ```
type TopicRule struct {
	pulumi.CustomResourceState

	// The ARN of the topic rule
	Arn              pulumi.StringOutput                `pulumi:"arn"`
	CloudwatchAlarm  TopicRuleCloudwatchAlarmPtrOutput  `pulumi:"cloudwatchAlarm"`
	CloudwatchLogs   TopicRuleCloudwatchLogArrayOutput  `pulumi:"cloudwatchLogs"`
	CloudwatchMetric TopicRuleCloudwatchMetricPtrOutput `pulumi:"cloudwatchMetric"`
	// The description of the rule.
	Description   pulumi.StringPtrOutput          `pulumi:"description"`
	Dynamodb      TopicRuleDynamodbPtrOutput      `pulumi:"dynamodb"`
	Dynamodbv2s   TopicRuleDynamodbv2ArrayOutput  `pulumi:"dynamodbv2s"`
	Elasticsearch TopicRuleElasticsearchPtrOutput `pulumi:"elasticsearch"`
	// Specifies whether the rule is enabled.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// Configuration block with error action to be associated with the rule. See the documentation for `cloudwatchAlarm`, `cloudwatchLogs`, `cloudwatchMetric`, `dynamodb`, `dynamodbv2`, `elasticsearch`, `firehose`, `iotAnalytics`, `iotEvents`, `kinesis`, `lambda`, `republish`, `s3`, `stepFunctions`, `sns`, `sqs` configuration blocks for further configuration details.
	ErrorAction  TopicRuleErrorActionPtrOutput   `pulumi:"errorAction"`
	Firehose     TopicRuleFirehosePtrOutput      `pulumi:"firehose"`
	IotAnalytics TopicRuleIotAnalyticArrayOutput `pulumi:"iotAnalytics"`
	IotEvents    TopicRuleIotEventArrayOutput    `pulumi:"iotEvents"`
	Kinesis      TopicRuleKinesisPtrOutput       `pulumi:"kinesis"`
	Lambda       TopicRuleLambdaPtrOutput        `pulumi:"lambda"`
	// The name of the rule.
	Name      pulumi.StringOutput         `pulumi:"name"`
	Republish TopicRuleRepublishPtrOutput `pulumi:"republish"`
	S3        TopicRuleS3PtrOutput        `pulumi:"s3"`
	Sns       TopicRuleSnsPtrOutput       `pulumi:"sns"`
	// The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
	Sql pulumi.StringOutput `pulumi:"sql"`
	// The version of the SQL rules engine to use when evaluating the rule.
	SqlVersion    pulumi.StringOutput              `pulumi:"sqlVersion"`
	Sqs           TopicRuleSqsPtrOutput            `pulumi:"sqs"`
	StepFunctions TopicRuleStepFunctionArrayOutput `pulumi:"stepFunctions"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider .
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewTopicRule registers a new resource with the given unique name, arguments, and options.
func NewTopicRule(ctx *pulumi.Context,
	name string, args *TopicRuleArgs, opts ...pulumi.ResourceOption) (*TopicRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.Sql == nil {
		return nil, errors.New("invalid value for required argument 'Sql'")
	}
	if args.SqlVersion == nil {
		return nil, errors.New("invalid value for required argument 'SqlVersion'")
	}
	var resource TopicRule
	err := ctx.RegisterResource("aws:iot/topicRule:TopicRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTopicRule gets an existing TopicRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTopicRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TopicRuleState, opts ...pulumi.ResourceOption) (*TopicRule, error) {
	var resource TopicRule
	err := ctx.ReadResource("aws:iot/topicRule:TopicRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TopicRule resources.
type topicRuleState struct {
	// The ARN of the topic rule
	Arn              *string                    `pulumi:"arn"`
	CloudwatchAlarm  *TopicRuleCloudwatchAlarm  `pulumi:"cloudwatchAlarm"`
	CloudwatchLogs   []TopicRuleCloudwatchLog   `pulumi:"cloudwatchLogs"`
	CloudwatchMetric *TopicRuleCloudwatchMetric `pulumi:"cloudwatchMetric"`
	// The description of the rule.
	Description   *string                 `pulumi:"description"`
	Dynamodb      *TopicRuleDynamodb      `pulumi:"dynamodb"`
	Dynamodbv2s   []TopicRuleDynamodbv2   `pulumi:"dynamodbv2s"`
	Elasticsearch *TopicRuleElasticsearch `pulumi:"elasticsearch"`
	// Specifies whether the rule is enabled.
	Enabled *bool `pulumi:"enabled"`
	// Configuration block with error action to be associated with the rule. See the documentation for `cloudwatchAlarm`, `cloudwatchLogs`, `cloudwatchMetric`, `dynamodb`, `dynamodbv2`, `elasticsearch`, `firehose`, `iotAnalytics`, `iotEvents`, `kinesis`, `lambda`, `republish`, `s3`, `stepFunctions`, `sns`, `sqs` configuration blocks for further configuration details.
	ErrorAction  *TopicRuleErrorAction  `pulumi:"errorAction"`
	Firehose     *TopicRuleFirehose     `pulumi:"firehose"`
	IotAnalytics []TopicRuleIotAnalytic `pulumi:"iotAnalytics"`
	IotEvents    []TopicRuleIotEvent    `pulumi:"iotEvents"`
	Kinesis      *TopicRuleKinesis      `pulumi:"kinesis"`
	Lambda       *TopicRuleLambda       `pulumi:"lambda"`
	// The name of the rule.
	Name      *string             `pulumi:"name"`
	Republish *TopicRuleRepublish `pulumi:"republish"`
	S3        *TopicRuleS3        `pulumi:"s3"`
	Sns       *TopicRuleSns       `pulumi:"sns"`
	// The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
	Sql *string `pulumi:"sql"`
	// The version of the SQL rules engine to use when evaluating the rule.
	SqlVersion    *string                 `pulumi:"sqlVersion"`
	Sqs           *TopicRuleSqs           `pulumi:"sqs"`
	StepFunctions []TopicRuleStepFunction `pulumi:"stepFunctions"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider .
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type TopicRuleState struct {
	// The ARN of the topic rule
	Arn              pulumi.StringPtrInput
	CloudwatchAlarm  TopicRuleCloudwatchAlarmPtrInput
	CloudwatchLogs   TopicRuleCloudwatchLogArrayInput
	CloudwatchMetric TopicRuleCloudwatchMetricPtrInput
	// The description of the rule.
	Description   pulumi.StringPtrInput
	Dynamodb      TopicRuleDynamodbPtrInput
	Dynamodbv2s   TopicRuleDynamodbv2ArrayInput
	Elasticsearch TopicRuleElasticsearchPtrInput
	// Specifies whether the rule is enabled.
	Enabled pulumi.BoolPtrInput
	// Configuration block with error action to be associated with the rule. See the documentation for `cloudwatchAlarm`, `cloudwatchLogs`, `cloudwatchMetric`, `dynamodb`, `dynamodbv2`, `elasticsearch`, `firehose`, `iotAnalytics`, `iotEvents`, `kinesis`, `lambda`, `republish`, `s3`, `stepFunctions`, `sns`, `sqs` configuration blocks for further configuration details.
	ErrorAction  TopicRuleErrorActionPtrInput
	Firehose     TopicRuleFirehosePtrInput
	IotAnalytics TopicRuleIotAnalyticArrayInput
	IotEvents    TopicRuleIotEventArrayInput
	Kinesis      TopicRuleKinesisPtrInput
	Lambda       TopicRuleLambdaPtrInput
	// The name of the rule.
	Name      pulumi.StringPtrInput
	Republish TopicRuleRepublishPtrInput
	S3        TopicRuleS3PtrInput
	Sns       TopicRuleSnsPtrInput
	// The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
	Sql pulumi.StringPtrInput
	// The version of the SQL rules engine to use when evaluating the rule.
	SqlVersion    pulumi.StringPtrInput
	Sqs           TopicRuleSqsPtrInput
	StepFunctions TopicRuleStepFunctionArrayInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider .
	TagsAll pulumi.StringMapInput
}

func (TopicRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*topicRuleState)(nil)).Elem()
}

type topicRuleArgs struct {
	CloudwatchAlarm  *TopicRuleCloudwatchAlarm  `pulumi:"cloudwatchAlarm"`
	CloudwatchLogs   []TopicRuleCloudwatchLog   `pulumi:"cloudwatchLogs"`
	CloudwatchMetric *TopicRuleCloudwatchMetric `pulumi:"cloudwatchMetric"`
	// The description of the rule.
	Description   *string                 `pulumi:"description"`
	Dynamodb      *TopicRuleDynamodb      `pulumi:"dynamodb"`
	Dynamodbv2s   []TopicRuleDynamodbv2   `pulumi:"dynamodbv2s"`
	Elasticsearch *TopicRuleElasticsearch `pulumi:"elasticsearch"`
	// Specifies whether the rule is enabled.
	Enabled bool `pulumi:"enabled"`
	// Configuration block with error action to be associated with the rule. See the documentation for `cloudwatchAlarm`, `cloudwatchLogs`, `cloudwatchMetric`, `dynamodb`, `dynamodbv2`, `elasticsearch`, `firehose`, `iotAnalytics`, `iotEvents`, `kinesis`, `lambda`, `republish`, `s3`, `stepFunctions`, `sns`, `sqs` configuration blocks for further configuration details.
	ErrorAction  *TopicRuleErrorAction  `pulumi:"errorAction"`
	Firehose     *TopicRuleFirehose     `pulumi:"firehose"`
	IotAnalytics []TopicRuleIotAnalytic `pulumi:"iotAnalytics"`
	IotEvents    []TopicRuleIotEvent    `pulumi:"iotEvents"`
	Kinesis      *TopicRuleKinesis      `pulumi:"kinesis"`
	Lambda       *TopicRuleLambda       `pulumi:"lambda"`
	// The name of the rule.
	Name      *string             `pulumi:"name"`
	Republish *TopicRuleRepublish `pulumi:"republish"`
	S3        *TopicRuleS3        `pulumi:"s3"`
	Sns       *TopicRuleSns       `pulumi:"sns"`
	// The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
	Sql string `pulumi:"sql"`
	// The version of the SQL rules engine to use when evaluating the rule.
	SqlVersion    string                  `pulumi:"sqlVersion"`
	Sqs           *TopicRuleSqs           `pulumi:"sqs"`
	StepFunctions []TopicRuleStepFunction `pulumi:"stepFunctions"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a TopicRule resource.
type TopicRuleArgs struct {
	CloudwatchAlarm  TopicRuleCloudwatchAlarmPtrInput
	CloudwatchLogs   TopicRuleCloudwatchLogArrayInput
	CloudwatchMetric TopicRuleCloudwatchMetricPtrInput
	// The description of the rule.
	Description   pulumi.StringPtrInput
	Dynamodb      TopicRuleDynamodbPtrInput
	Dynamodbv2s   TopicRuleDynamodbv2ArrayInput
	Elasticsearch TopicRuleElasticsearchPtrInput
	// Specifies whether the rule is enabled.
	Enabled pulumi.BoolInput
	// Configuration block with error action to be associated with the rule. See the documentation for `cloudwatchAlarm`, `cloudwatchLogs`, `cloudwatchMetric`, `dynamodb`, `dynamodbv2`, `elasticsearch`, `firehose`, `iotAnalytics`, `iotEvents`, `kinesis`, `lambda`, `republish`, `s3`, `stepFunctions`, `sns`, `sqs` configuration blocks for further configuration details.
	ErrorAction  TopicRuleErrorActionPtrInput
	Firehose     TopicRuleFirehosePtrInput
	IotAnalytics TopicRuleIotAnalyticArrayInput
	IotEvents    TopicRuleIotEventArrayInput
	Kinesis      TopicRuleKinesisPtrInput
	Lambda       TopicRuleLambdaPtrInput
	// The name of the rule.
	Name      pulumi.StringPtrInput
	Republish TopicRuleRepublishPtrInput
	S3        TopicRuleS3PtrInput
	Sns       TopicRuleSnsPtrInput
	// The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
	Sql pulumi.StringInput
	// The version of the SQL rules engine to use when evaluating the rule.
	SqlVersion    pulumi.StringInput
	Sqs           TopicRuleSqsPtrInput
	StepFunctions TopicRuleStepFunctionArrayInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (TopicRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*topicRuleArgs)(nil)).Elem()
}

type TopicRuleInput interface {
	pulumi.Input

	ToTopicRuleOutput() TopicRuleOutput
	ToTopicRuleOutputWithContext(ctx context.Context) TopicRuleOutput
}

func (*TopicRule) ElementType() reflect.Type {
	return reflect.TypeOf((**TopicRule)(nil)).Elem()
}

func (i *TopicRule) ToTopicRuleOutput() TopicRuleOutput {
	return i.ToTopicRuleOutputWithContext(context.Background())
}

func (i *TopicRule) ToTopicRuleOutputWithContext(ctx context.Context) TopicRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TopicRuleOutput)
}

// TopicRuleArrayInput is an input type that accepts TopicRuleArray and TopicRuleArrayOutput values.
// You can construct a concrete instance of `TopicRuleArrayInput` via:
//
//          TopicRuleArray{ TopicRuleArgs{...} }
type TopicRuleArrayInput interface {
	pulumi.Input

	ToTopicRuleArrayOutput() TopicRuleArrayOutput
	ToTopicRuleArrayOutputWithContext(context.Context) TopicRuleArrayOutput
}

type TopicRuleArray []TopicRuleInput

func (TopicRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TopicRule)(nil)).Elem()
}

func (i TopicRuleArray) ToTopicRuleArrayOutput() TopicRuleArrayOutput {
	return i.ToTopicRuleArrayOutputWithContext(context.Background())
}

func (i TopicRuleArray) ToTopicRuleArrayOutputWithContext(ctx context.Context) TopicRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TopicRuleArrayOutput)
}

// TopicRuleMapInput is an input type that accepts TopicRuleMap and TopicRuleMapOutput values.
// You can construct a concrete instance of `TopicRuleMapInput` via:
//
//          TopicRuleMap{ "key": TopicRuleArgs{...} }
type TopicRuleMapInput interface {
	pulumi.Input

	ToTopicRuleMapOutput() TopicRuleMapOutput
	ToTopicRuleMapOutputWithContext(context.Context) TopicRuleMapOutput
}

type TopicRuleMap map[string]TopicRuleInput

func (TopicRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TopicRule)(nil)).Elem()
}

func (i TopicRuleMap) ToTopicRuleMapOutput() TopicRuleMapOutput {
	return i.ToTopicRuleMapOutputWithContext(context.Background())
}

func (i TopicRuleMap) ToTopicRuleMapOutputWithContext(ctx context.Context) TopicRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TopicRuleMapOutput)
}

type TopicRuleOutput struct{ *pulumi.OutputState }

func (TopicRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TopicRule)(nil)).Elem()
}

func (o TopicRuleOutput) ToTopicRuleOutput() TopicRuleOutput {
	return o
}

func (o TopicRuleOutput) ToTopicRuleOutputWithContext(ctx context.Context) TopicRuleOutput {
	return o
}

type TopicRuleArrayOutput struct{ *pulumi.OutputState }

func (TopicRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TopicRule)(nil)).Elem()
}

func (o TopicRuleArrayOutput) ToTopicRuleArrayOutput() TopicRuleArrayOutput {
	return o
}

func (o TopicRuleArrayOutput) ToTopicRuleArrayOutputWithContext(ctx context.Context) TopicRuleArrayOutput {
	return o
}

func (o TopicRuleArrayOutput) Index(i pulumi.IntInput) TopicRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TopicRule {
		return vs[0].([]*TopicRule)[vs[1].(int)]
	}).(TopicRuleOutput)
}

type TopicRuleMapOutput struct{ *pulumi.OutputState }

func (TopicRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TopicRule)(nil)).Elem()
}

func (o TopicRuleMapOutput) ToTopicRuleMapOutput() TopicRuleMapOutput {
	return o
}

func (o TopicRuleMapOutput) ToTopicRuleMapOutputWithContext(ctx context.Context) TopicRuleMapOutput {
	return o
}

func (o TopicRuleMapOutput) MapIndex(k pulumi.StringInput) TopicRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TopicRule {
		return vs[0].(map[string]*TopicRule)[vs[1].(string)]
	}).(TopicRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TopicRuleInput)(nil)).Elem(), &TopicRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*TopicRuleArrayInput)(nil)).Elem(), TopicRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TopicRuleMapInput)(nil)).Elem(), TopicRuleMap{})
	pulumi.RegisterOutputType(TopicRuleOutput{})
	pulumi.RegisterOutputType(TopicRuleArrayOutput{})
	pulumi.RegisterOutputType(TopicRuleMapOutput{})
}
