// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apigateway

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an API Gateway Stage. A stage is a named reference to a deployment, which can be done via the `apigateway.Deployment` resource. Stages can be optionally managed further with the `apigateway.BasePathMapping` resource, `apigateway.DomainName` resource, and `awsApiMethodSettings` resource. For more information, see the [API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-stages.html).
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/apigateway"
//	"github.com/pulumi/pulumi-std/sdk/go/std"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"openapi": "3.0.1",
//				"info": map[string]interface{}{
//					"title":   "example",
//					"version": "1.0",
//				},
//				"paths": map[string]interface{}{
//					"/path1": map[string]interface{}{
//						"get": map[string]interface{}{
//							"x-amazon-apigateway-integration": map[string]interface{}{
//								"httpMethod":           "GET",
//								"payloadFormatVersion": "1.0",
//								"type":                 "HTTP_PROXY",
//								"uri":                  "https://ip-ranges.amazonaws.com/ip-ranges.json",
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			example, err := apigateway.NewRestApi(ctx, "example", &apigateway.RestApiArgs{
//				Body: pulumi.String(json0),
//				Name: pulumi.String("example"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleDeployment, err := apigateway.NewDeployment(ctx, "example", &apigateway.DeploymentArgs{
//				RestApi: example.ID(),
//				Triggers: pulumi.StringMap{
//					"redeployment": std.Sha1Output(ctx, std.Sha1OutputArgs{
//						Input: example.Body.ApplyT(func(body *string) (pulumi.String, error) {
//							var _zero pulumi.String
//							tmpJSON1, err := json.Marshal(body)
//							if err != nil {
//								return _zero, err
//							}
//							json1 := string(tmpJSON1)
//							return pulumi.String(json1), nil
//						}).(pulumi.StringOutput),
//					}, nil).ApplyT(func(invoke std.Sha1Result) (*string, error) {
//						return invoke.Result, nil
//					}).(pulumi.StringPtrOutput),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleStage, err := apigateway.NewStage(ctx, "example", &apigateway.StageArgs{
//				Deployment: exampleDeployment.ID(),
//				RestApi:    example.ID(),
//				StageName:  pulumi.String("example"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = apigateway.NewMethodSettings(ctx, "example", &apigateway.MethodSettingsArgs{
//				RestApi:    example.ID(),
//				StageName:  exampleStage.StageName,
//				MethodPath: pulumi.String("*/*"),
//				Settings: &apigateway.MethodSettingsSettingsArgs{
//					MetricsEnabled: pulumi.Bool(true),
//					LoggingLevel:   pulumi.String("INFO"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ### Managing the API Logging CloudWatch Log Group
//
// API Gateway provides the ability to [enable CloudWatch API logging](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html). To manage the CloudWatch Log Group when this feature is enabled, the `cloudwatch.LogGroup` resource can be used where the name matches the API Gateway naming convention. If the CloudWatch Log Group previously exists, import the `cloudwatch.LogGroup` resource into Pulumi as a one time operation. You can recreate the environment without import.
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/apigateway"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/cloudwatch"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			stageName := "example"
//			if param := cfg.Get("stageName"); param != "" {
//				stageName = param
//			}
//			example, err := apigateway.NewRestApi(ctx, "example", nil)
//			if err != nil {
//				return err
//			}
//			_, err = apigateway.NewStage(ctx, "example", &apigateway.StageArgs{
//				StageName: pulumi.String(stageName),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudwatch.NewLogGroup(ctx, "example", &cloudwatch.LogGroupArgs{
//				Name: example.ID().ApplyT(func(id string) (string, error) {
//					return fmt.Sprintf("API-Gateway-Execution-Logs_%v/%v", id, stageName), nil
//				}).(pulumi.StringOutput),
//				RetentionInDays: pulumi.Int(7),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Using `pulumi import`, import `aws_api_gateway_stage` using `REST-API-ID/STAGE-NAME`. For example:
//
// ```sh
// $ pulumi import aws:apigateway/stage:Stage example 12345abcde/example
// ```
type Stage struct {
	pulumi.CustomResourceState

	// Enables access logs for the API stage. See Access Log Settings below.
	AccessLogSettings StageAccessLogSettingsPtrOutput `pulumi:"accessLogSettings"`
	// ARN
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Whether a cache cluster is enabled for the stage
	CacheClusterEnabled pulumi.BoolPtrOutput `pulumi:"cacheClusterEnabled"`
	// Size of the cache cluster for the stage, if enabled. Allowed values include `0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118` and `237`.
	CacheClusterSize pulumi.StringPtrOutput `pulumi:"cacheClusterSize"`
	// Configuration settings of a canary deployment. See Canary Settings below.
	CanarySettings StageCanarySettingsPtrOutput `pulumi:"canarySettings"`
	// Identifier of a client certificate for the stage.
	ClientCertificateId pulumi.StringPtrOutput `pulumi:"clientCertificateId"`
	// ID of the deployment that the stage points to
	Deployment pulumi.StringOutput `pulumi:"deployment"`
	// Description of the stage.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Version of the associated API documentation
	DocumentationVersion pulumi.StringPtrOutput `pulumi:"documentationVersion"`
	// Execution ARN to be used in `lambdaPermission`'s `sourceArn`
	// when allowing API Gateway to invoke a Lambda function,
	// e.g., `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j/prod`
	ExecutionArn pulumi.StringOutput `pulumi:"executionArn"`
	// URL to invoke the API pointing to the stage,
	// e.g., `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/prod`
	InvokeUrl pulumi.StringOutput `pulumi:"invokeUrl"`
	// ID of the associated REST API
	RestApi pulumi.StringOutput `pulumi:"restApi"`
	// Name of the stage
	StageName pulumi.StringOutput `pulumi:"stageName"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Map that defines the stage variables
	Variables pulumi.StringMapOutput `pulumi:"variables"`
	// ARN of the WebAcl associated with the Stage.
	WebAclArn pulumi.StringOutput `pulumi:"webAclArn"`
	// Whether active tracing with X-ray is enabled. Defaults to `false`.
	XrayTracingEnabled pulumi.BoolPtrOutput `pulumi:"xrayTracingEnabled"`
}

// NewStage registers a new resource with the given unique name, arguments, and options.
func NewStage(ctx *pulumi.Context,
	name string, args *StageArgs, opts ...pulumi.ResourceOption) (*Stage, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Deployment == nil {
		return nil, errors.New("invalid value for required argument 'Deployment'")
	}
	if args.RestApi == nil {
		return nil, errors.New("invalid value for required argument 'RestApi'")
	}
	if args.StageName == nil {
		return nil, errors.New("invalid value for required argument 'StageName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Stage
	err := ctx.RegisterResource("aws:apigateway/stage:Stage", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStage gets an existing Stage resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStage(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StageState, opts ...pulumi.ResourceOption) (*Stage, error) {
	var resource Stage
	err := ctx.ReadResource("aws:apigateway/stage:Stage", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Stage resources.
type stageState struct {
	// Enables access logs for the API stage. See Access Log Settings below.
	AccessLogSettings *StageAccessLogSettings `pulumi:"accessLogSettings"`
	// ARN
	Arn *string `pulumi:"arn"`
	// Whether a cache cluster is enabled for the stage
	CacheClusterEnabled *bool `pulumi:"cacheClusterEnabled"`
	// Size of the cache cluster for the stage, if enabled. Allowed values include `0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118` and `237`.
	CacheClusterSize *string `pulumi:"cacheClusterSize"`
	// Configuration settings of a canary deployment. See Canary Settings below.
	CanarySettings *StageCanarySettings `pulumi:"canarySettings"`
	// Identifier of a client certificate for the stage.
	ClientCertificateId *string `pulumi:"clientCertificateId"`
	// ID of the deployment that the stage points to
	Deployment interface{} `pulumi:"deployment"`
	// Description of the stage.
	Description *string `pulumi:"description"`
	// Version of the associated API documentation
	DocumentationVersion *string `pulumi:"documentationVersion"`
	// Execution ARN to be used in `lambdaPermission`'s `sourceArn`
	// when allowing API Gateway to invoke a Lambda function,
	// e.g., `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j/prod`
	ExecutionArn *string `pulumi:"executionArn"`
	// URL to invoke the API pointing to the stage,
	// e.g., `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/prod`
	InvokeUrl *string `pulumi:"invokeUrl"`
	// ID of the associated REST API
	RestApi interface{} `pulumi:"restApi"`
	// Name of the stage
	StageName *string `pulumi:"stageName"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Map that defines the stage variables
	Variables map[string]string `pulumi:"variables"`
	// ARN of the WebAcl associated with the Stage.
	WebAclArn *string `pulumi:"webAclArn"`
	// Whether active tracing with X-ray is enabled. Defaults to `false`.
	XrayTracingEnabled *bool `pulumi:"xrayTracingEnabled"`
}

type StageState struct {
	// Enables access logs for the API stage. See Access Log Settings below.
	AccessLogSettings StageAccessLogSettingsPtrInput
	// ARN
	Arn pulumi.StringPtrInput
	// Whether a cache cluster is enabled for the stage
	CacheClusterEnabled pulumi.BoolPtrInput
	// Size of the cache cluster for the stage, if enabled. Allowed values include `0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118` and `237`.
	CacheClusterSize pulumi.StringPtrInput
	// Configuration settings of a canary deployment. See Canary Settings below.
	CanarySettings StageCanarySettingsPtrInput
	// Identifier of a client certificate for the stage.
	ClientCertificateId pulumi.StringPtrInput
	// ID of the deployment that the stage points to
	Deployment pulumi.Input
	// Description of the stage.
	Description pulumi.StringPtrInput
	// Version of the associated API documentation
	DocumentationVersion pulumi.StringPtrInput
	// Execution ARN to be used in `lambdaPermission`'s `sourceArn`
	// when allowing API Gateway to invoke a Lambda function,
	// e.g., `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j/prod`
	ExecutionArn pulumi.StringPtrInput
	// URL to invoke the API pointing to the stage,
	// e.g., `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/prod`
	InvokeUrl pulumi.StringPtrInput
	// ID of the associated REST API
	RestApi pulumi.Input
	// Name of the stage
	StageName pulumi.StringPtrInput
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// Map that defines the stage variables
	Variables pulumi.StringMapInput
	// ARN of the WebAcl associated with the Stage.
	WebAclArn pulumi.StringPtrInput
	// Whether active tracing with X-ray is enabled. Defaults to `false`.
	XrayTracingEnabled pulumi.BoolPtrInput
}

func (StageState) ElementType() reflect.Type {
	return reflect.TypeOf((*stageState)(nil)).Elem()
}

type stageArgs struct {
	// Enables access logs for the API stage. See Access Log Settings below.
	AccessLogSettings *StageAccessLogSettings `pulumi:"accessLogSettings"`
	// Whether a cache cluster is enabled for the stage
	CacheClusterEnabled *bool `pulumi:"cacheClusterEnabled"`
	// Size of the cache cluster for the stage, if enabled. Allowed values include `0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118` and `237`.
	CacheClusterSize *string `pulumi:"cacheClusterSize"`
	// Configuration settings of a canary deployment. See Canary Settings below.
	CanarySettings *StageCanarySettings `pulumi:"canarySettings"`
	// Identifier of a client certificate for the stage.
	ClientCertificateId *string `pulumi:"clientCertificateId"`
	// ID of the deployment that the stage points to
	Deployment interface{} `pulumi:"deployment"`
	// Description of the stage.
	Description *string `pulumi:"description"`
	// Version of the associated API documentation
	DocumentationVersion *string `pulumi:"documentationVersion"`
	// ID of the associated REST API
	RestApi interface{} `pulumi:"restApi"`
	// Name of the stage
	StageName string `pulumi:"stageName"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Map that defines the stage variables
	Variables map[string]string `pulumi:"variables"`
	// Whether active tracing with X-ray is enabled. Defaults to `false`.
	XrayTracingEnabled *bool `pulumi:"xrayTracingEnabled"`
}

// The set of arguments for constructing a Stage resource.
type StageArgs struct {
	// Enables access logs for the API stage. See Access Log Settings below.
	AccessLogSettings StageAccessLogSettingsPtrInput
	// Whether a cache cluster is enabled for the stage
	CacheClusterEnabled pulumi.BoolPtrInput
	// Size of the cache cluster for the stage, if enabled. Allowed values include `0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118` and `237`.
	CacheClusterSize pulumi.StringPtrInput
	// Configuration settings of a canary deployment. See Canary Settings below.
	CanarySettings StageCanarySettingsPtrInput
	// Identifier of a client certificate for the stage.
	ClientCertificateId pulumi.StringPtrInput
	// ID of the deployment that the stage points to
	Deployment pulumi.Input
	// Description of the stage.
	Description pulumi.StringPtrInput
	// Version of the associated API documentation
	DocumentationVersion pulumi.StringPtrInput
	// ID of the associated REST API
	RestApi pulumi.Input
	// Name of the stage
	StageName pulumi.StringInput
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Map that defines the stage variables
	Variables pulumi.StringMapInput
	// Whether active tracing with X-ray is enabled. Defaults to `false`.
	XrayTracingEnabled pulumi.BoolPtrInput
}

func (StageArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*stageArgs)(nil)).Elem()
}

type StageInput interface {
	pulumi.Input

	ToStageOutput() StageOutput
	ToStageOutputWithContext(ctx context.Context) StageOutput
}

func (*Stage) ElementType() reflect.Type {
	return reflect.TypeOf((**Stage)(nil)).Elem()
}

func (i *Stage) ToStageOutput() StageOutput {
	return i.ToStageOutputWithContext(context.Background())
}

func (i *Stage) ToStageOutputWithContext(ctx context.Context) StageOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StageOutput)
}

// StageArrayInput is an input type that accepts StageArray and StageArrayOutput values.
// You can construct a concrete instance of `StageArrayInput` via:
//
//	StageArray{ StageArgs{...} }
type StageArrayInput interface {
	pulumi.Input

	ToStageArrayOutput() StageArrayOutput
	ToStageArrayOutputWithContext(context.Context) StageArrayOutput
}

type StageArray []StageInput

func (StageArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Stage)(nil)).Elem()
}

func (i StageArray) ToStageArrayOutput() StageArrayOutput {
	return i.ToStageArrayOutputWithContext(context.Background())
}

func (i StageArray) ToStageArrayOutputWithContext(ctx context.Context) StageArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StageArrayOutput)
}

// StageMapInput is an input type that accepts StageMap and StageMapOutput values.
// You can construct a concrete instance of `StageMapInput` via:
//
//	StageMap{ "key": StageArgs{...} }
type StageMapInput interface {
	pulumi.Input

	ToStageMapOutput() StageMapOutput
	ToStageMapOutputWithContext(context.Context) StageMapOutput
}

type StageMap map[string]StageInput

func (StageMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Stage)(nil)).Elem()
}

func (i StageMap) ToStageMapOutput() StageMapOutput {
	return i.ToStageMapOutputWithContext(context.Background())
}

func (i StageMap) ToStageMapOutputWithContext(ctx context.Context) StageMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StageMapOutput)
}

type StageOutput struct{ *pulumi.OutputState }

func (StageOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Stage)(nil)).Elem()
}

func (o StageOutput) ToStageOutput() StageOutput {
	return o
}

func (o StageOutput) ToStageOutputWithContext(ctx context.Context) StageOutput {
	return o
}

// Enables access logs for the API stage. See Access Log Settings below.
func (o StageOutput) AccessLogSettings() StageAccessLogSettingsPtrOutput {
	return o.ApplyT(func(v *Stage) StageAccessLogSettingsPtrOutput { return v.AccessLogSettings }).(StageAccessLogSettingsPtrOutput)
}

// ARN
func (o StageOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Whether a cache cluster is enabled for the stage
func (o StageOutput) CacheClusterEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Stage) pulumi.BoolPtrOutput { return v.CacheClusterEnabled }).(pulumi.BoolPtrOutput)
}

// Size of the cache cluster for the stage, if enabled. Allowed values include `0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118` and `237`.
func (o StageOutput) CacheClusterSize() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringPtrOutput { return v.CacheClusterSize }).(pulumi.StringPtrOutput)
}

// Configuration settings of a canary deployment. See Canary Settings below.
func (o StageOutput) CanarySettings() StageCanarySettingsPtrOutput {
	return o.ApplyT(func(v *Stage) StageCanarySettingsPtrOutput { return v.CanarySettings }).(StageCanarySettingsPtrOutput)
}

// Identifier of a client certificate for the stage.
func (o StageOutput) ClientCertificateId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringPtrOutput { return v.ClientCertificateId }).(pulumi.StringPtrOutput)
}

// ID of the deployment that the stage points to
func (o StageOutput) Deployment() pulumi.StringOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringOutput { return v.Deployment }).(pulumi.StringOutput)
}

// Description of the stage.
func (o StageOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Version of the associated API documentation
func (o StageOutput) DocumentationVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringPtrOutput { return v.DocumentationVersion }).(pulumi.StringPtrOutput)
}

// Execution ARN to be used in `lambdaPermission`'s `sourceArn`
// when allowing API Gateway to invoke a Lambda function,
// e.g., `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j/prod`
func (o StageOutput) ExecutionArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringOutput { return v.ExecutionArn }).(pulumi.StringOutput)
}

// URL to invoke the API pointing to the stage,
// e.g., `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/prod`
func (o StageOutput) InvokeUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringOutput { return v.InvokeUrl }).(pulumi.StringOutput)
}

// ID of the associated REST API
func (o StageOutput) RestApi() pulumi.StringOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringOutput { return v.RestApi }).(pulumi.StringOutput)
}

// Name of the stage
func (o StageOutput) StageName() pulumi.StringOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringOutput { return v.StageName }).(pulumi.StringOutput)
}

// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o StageOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o StageOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Map that defines the stage variables
func (o StageOutput) Variables() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringMapOutput { return v.Variables }).(pulumi.StringMapOutput)
}

// ARN of the WebAcl associated with the Stage.
func (o StageOutput) WebAclArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringOutput { return v.WebAclArn }).(pulumi.StringOutput)
}

// Whether active tracing with X-ray is enabled. Defaults to `false`.
func (o StageOutput) XrayTracingEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Stage) pulumi.BoolPtrOutput { return v.XrayTracingEnabled }).(pulumi.BoolPtrOutput)
}

type StageArrayOutput struct{ *pulumi.OutputState }

func (StageArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Stage)(nil)).Elem()
}

func (o StageArrayOutput) ToStageArrayOutput() StageArrayOutput {
	return o
}

func (o StageArrayOutput) ToStageArrayOutputWithContext(ctx context.Context) StageArrayOutput {
	return o
}

func (o StageArrayOutput) Index(i pulumi.IntInput) StageOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Stage {
		return vs[0].([]*Stage)[vs[1].(int)]
	}).(StageOutput)
}

type StageMapOutput struct{ *pulumi.OutputState }

func (StageMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Stage)(nil)).Elem()
}

func (o StageMapOutput) ToStageMapOutput() StageMapOutput {
	return o
}

func (o StageMapOutput) ToStageMapOutputWithContext(ctx context.Context) StageMapOutput {
	return o
}

func (o StageMapOutput) MapIndex(k pulumi.StringInput) StageOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Stage {
		return vs[0].(map[string]*Stage)[vs[1].(string)]
	}).(StageOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StageInput)(nil)).Elem(), &Stage{})
	pulumi.RegisterInputType(reflect.TypeOf((*StageArrayInput)(nil)).Elem(), StageArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StageMapInput)(nil)).Elem(), StageMap{})
	pulumi.RegisterOutputType(StageOutput{})
	pulumi.RegisterOutputType(StageArrayOutput{})
	pulumi.RegisterOutputType(StageMapOutput{})
}
