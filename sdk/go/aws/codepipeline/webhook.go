// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package codepipeline

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a CodePipeline Webhook.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/codepipeline"
//	"github.com/pulumi/pulumi-github/sdk/v5/go/github"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			barPipeline, err := codepipeline.NewPipeline(ctx, "barPipeline", &codepipeline.PipelineArgs{
//				RoleArn: pulumi.Any(aws_iam_role.Bar.Arn),
//				ArtifactStores: codepipeline.PipelineArtifactStoreArray{
//					&codepipeline.PipelineArtifactStoreArgs{
//						Location: pulumi.Any(aws_s3_bucket.Bar.Bucket),
//						Type:     pulumi.String("S3"),
//						EncryptionKey: &codepipeline.PipelineArtifactStoreEncryptionKeyArgs{
//							Id:   pulumi.Any(data.Aws_kms_alias.S3kmskey.Arn),
//							Type: pulumi.String("KMS"),
//						},
//					},
//				},
//				Stages: codepipeline.PipelineStageArray{
//					&codepipeline.PipelineStageArgs{
//						Name: pulumi.String("Source"),
//						Actions: codepipeline.PipelineStageActionArray{
//							&codepipeline.PipelineStageActionArgs{
//								Name:     pulumi.String("Source"),
//								Category: pulumi.String("Source"),
//								Owner:    pulumi.String("ThirdParty"),
//								Provider: pulumi.String("GitHub"),
//								Version:  pulumi.String("1"),
//								OutputArtifacts: pulumi.StringArray{
//									pulumi.String("test"),
//								},
//								Configuration: pulumi.StringMap{
//									"Owner":  pulumi.String("my-organization"),
//									"Repo":   pulumi.String("test"),
//									"Branch": pulumi.String("master"),
//								},
//							},
//						},
//					},
//					&codepipeline.PipelineStageArgs{
//						Name: pulumi.String("Build"),
//						Actions: codepipeline.PipelineStageActionArray{
//							&codepipeline.PipelineStageActionArgs{
//								Name:     pulumi.String("Build"),
//								Category: pulumi.String("Build"),
//								Owner:    pulumi.String("AWS"),
//								Provider: pulumi.String("CodeBuild"),
//								InputArtifacts: pulumi.StringArray{
//									pulumi.String("test"),
//								},
//								Version: pulumi.String("1"),
//								Configuration: pulumi.StringMap{
//									"ProjectName": pulumi.String("test"),
//								},
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			webhookSecret := "super-secret"
//			barWebhook, err := codepipeline.NewWebhook(ctx, "barWebhook", &codepipeline.WebhookArgs{
//				Authentication: pulumi.String("GITHUB_HMAC"),
//				TargetAction:   pulumi.String("Source"),
//				TargetPipeline: barPipeline.Name,
//				AuthenticationConfiguration: &codepipeline.WebhookAuthenticationConfigurationArgs{
//					SecretToken: pulumi.String(webhookSecret),
//				},
//				Filters: codepipeline.WebhookFilterArray{
//					&codepipeline.WebhookFilterArgs{
//						JsonPath:    pulumi.String("$.ref"),
//						MatchEquals: pulumi.String("refs/heads/{Branch}"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = github.NewRepositoryWebhook(ctx, "barRepositoryWebhook", &github.RepositoryWebhookArgs{
//				Repository: pulumi.Any(github_repository.Repo.Name),
//				Configuration: &github.RepositoryWebhookConfigurationArgs{
//					Url:         barWebhook.Url,
//					ContentType: pulumi.String("json"),
//					InsecureSsl: pulumi.Bool(true),
//					Secret:      pulumi.String(webhookSecret),
//				},
//				Events: pulumi.StringArray{
//					pulumi.String("push"),
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
//
// ## Import
//
// Using `pulumi import`, import CodePipeline Webhooks using their ARN. For example:
//
// ```sh
//
//	$ pulumi import aws:codepipeline/webhook:Webhook example arn:aws:codepipeline:us-west-2:123456789012:webhook:example
//
// ```
type Webhook struct {
	pulumi.CustomResourceState

	// The CodePipeline webhook's ARN.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
	Authentication pulumi.StringOutput `pulumi:"authentication"`
	// An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
	AuthenticationConfiguration WebhookAuthenticationConfigurationPtrOutput `pulumi:"authenticationConfiguration"`
	// One or more `filter` blocks. Filter blocks are documented below.
	Filters WebhookFilterArrayOutput `pulumi:"filters"`
	// The name of the webhook.
	Name pulumi.StringOutput `pulumi:"name"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
	TargetAction pulumi.StringOutput `pulumi:"targetAction"`
	// The name of the pipeline.
	TargetPipeline pulumi.StringOutput `pulumi:"targetPipeline"`
	// The CodePipeline webhook's URL. POST events to this endpoint to trigger the target.
	Url pulumi.StringOutput `pulumi:"url"`
}

// NewWebhook registers a new resource with the given unique name, arguments, and options.
func NewWebhook(ctx *pulumi.Context,
	name string, args *WebhookArgs, opts ...pulumi.ResourceOption) (*Webhook, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Authentication == nil {
		return nil, errors.New("invalid value for required argument 'Authentication'")
	}
	if args.Filters == nil {
		return nil, errors.New("invalid value for required argument 'Filters'")
	}
	if args.TargetAction == nil {
		return nil, errors.New("invalid value for required argument 'TargetAction'")
	}
	if args.TargetPipeline == nil {
		return nil, errors.New("invalid value for required argument 'TargetPipeline'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Webhook
	err := ctx.RegisterResource("aws:codepipeline/webhook:Webhook", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWebhook gets an existing Webhook resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWebhook(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WebhookState, opts ...pulumi.ResourceOption) (*Webhook, error) {
	var resource Webhook
	err := ctx.ReadResource("aws:codepipeline/webhook:Webhook", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Webhook resources.
type webhookState struct {
	// The CodePipeline webhook's ARN.
	Arn *string `pulumi:"arn"`
	// The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
	Authentication *string `pulumi:"authentication"`
	// An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
	AuthenticationConfiguration *WebhookAuthenticationConfiguration `pulumi:"authenticationConfiguration"`
	// One or more `filter` blocks. Filter blocks are documented below.
	Filters []WebhookFilter `pulumi:"filters"`
	// The name of the webhook.
	Name *string `pulumi:"name"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
	TargetAction *string `pulumi:"targetAction"`
	// The name of the pipeline.
	TargetPipeline *string `pulumi:"targetPipeline"`
	// The CodePipeline webhook's URL. POST events to this endpoint to trigger the target.
	Url *string `pulumi:"url"`
}

type WebhookState struct {
	// The CodePipeline webhook's ARN.
	Arn pulumi.StringPtrInput
	// The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
	Authentication pulumi.StringPtrInput
	// An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
	AuthenticationConfiguration WebhookAuthenticationConfigurationPtrInput
	// One or more `filter` blocks. Filter blocks are documented below.
	Filters WebhookFilterArrayInput
	// The name of the webhook.
	Name pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
	TargetAction pulumi.StringPtrInput
	// The name of the pipeline.
	TargetPipeline pulumi.StringPtrInput
	// The CodePipeline webhook's URL. POST events to this endpoint to trigger the target.
	Url pulumi.StringPtrInput
}

func (WebhookState) ElementType() reflect.Type {
	return reflect.TypeOf((*webhookState)(nil)).Elem()
}

type webhookArgs struct {
	// The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
	Authentication string `pulumi:"authentication"`
	// An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
	AuthenticationConfiguration *WebhookAuthenticationConfiguration `pulumi:"authenticationConfiguration"`
	// One or more `filter` blocks. Filter blocks are documented below.
	Filters []WebhookFilter `pulumi:"filters"`
	// The name of the webhook.
	Name *string `pulumi:"name"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
	TargetAction string `pulumi:"targetAction"`
	// The name of the pipeline.
	TargetPipeline string `pulumi:"targetPipeline"`
}

// The set of arguments for constructing a Webhook resource.
type WebhookArgs struct {
	// The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
	Authentication pulumi.StringInput
	// An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
	AuthenticationConfiguration WebhookAuthenticationConfigurationPtrInput
	// One or more `filter` blocks. Filter blocks are documented below.
	Filters WebhookFilterArrayInput
	// The name of the webhook.
	Name pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
	TargetAction pulumi.StringInput
	// The name of the pipeline.
	TargetPipeline pulumi.StringInput
}

func (WebhookArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*webhookArgs)(nil)).Elem()
}

type WebhookInput interface {
	pulumi.Input

	ToWebhookOutput() WebhookOutput
	ToWebhookOutputWithContext(ctx context.Context) WebhookOutput
}

func (*Webhook) ElementType() reflect.Type {
	return reflect.TypeOf((**Webhook)(nil)).Elem()
}

func (i *Webhook) ToWebhookOutput() WebhookOutput {
	return i.ToWebhookOutputWithContext(context.Background())
}

func (i *Webhook) ToWebhookOutputWithContext(ctx context.Context) WebhookOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebhookOutput)
}

// WebhookArrayInput is an input type that accepts WebhookArray and WebhookArrayOutput values.
// You can construct a concrete instance of `WebhookArrayInput` via:
//
//	WebhookArray{ WebhookArgs{...} }
type WebhookArrayInput interface {
	pulumi.Input

	ToWebhookArrayOutput() WebhookArrayOutput
	ToWebhookArrayOutputWithContext(context.Context) WebhookArrayOutput
}

type WebhookArray []WebhookInput

func (WebhookArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Webhook)(nil)).Elem()
}

func (i WebhookArray) ToWebhookArrayOutput() WebhookArrayOutput {
	return i.ToWebhookArrayOutputWithContext(context.Background())
}

func (i WebhookArray) ToWebhookArrayOutputWithContext(ctx context.Context) WebhookArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebhookArrayOutput)
}

// WebhookMapInput is an input type that accepts WebhookMap and WebhookMapOutput values.
// You can construct a concrete instance of `WebhookMapInput` via:
//
//	WebhookMap{ "key": WebhookArgs{...} }
type WebhookMapInput interface {
	pulumi.Input

	ToWebhookMapOutput() WebhookMapOutput
	ToWebhookMapOutputWithContext(context.Context) WebhookMapOutput
}

type WebhookMap map[string]WebhookInput

func (WebhookMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Webhook)(nil)).Elem()
}

func (i WebhookMap) ToWebhookMapOutput() WebhookMapOutput {
	return i.ToWebhookMapOutputWithContext(context.Background())
}

func (i WebhookMap) ToWebhookMapOutputWithContext(ctx context.Context) WebhookMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebhookMapOutput)
}

type WebhookOutput struct{ *pulumi.OutputState }

func (WebhookOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Webhook)(nil)).Elem()
}

func (o WebhookOutput) ToWebhookOutput() WebhookOutput {
	return o
}

func (o WebhookOutput) ToWebhookOutputWithContext(ctx context.Context) WebhookOutput {
	return o
}

// The CodePipeline webhook's ARN.
func (o WebhookOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
func (o WebhookOutput) Authentication() pulumi.StringOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringOutput { return v.Authentication }).(pulumi.StringOutput)
}

// An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
func (o WebhookOutput) AuthenticationConfiguration() WebhookAuthenticationConfigurationPtrOutput {
	return o.ApplyT(func(v *Webhook) WebhookAuthenticationConfigurationPtrOutput { return v.AuthenticationConfiguration }).(WebhookAuthenticationConfigurationPtrOutput)
}

// One or more `filter` blocks. Filter blocks are documented below.
func (o WebhookOutput) Filters() WebhookFilterArrayOutput {
	return o.ApplyT(func(v *Webhook) WebhookFilterArrayOutput { return v.Filters }).(WebhookFilterArrayOutput)
}

// The name of the webhook.
func (o WebhookOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o WebhookOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o WebhookOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
func (o WebhookOutput) TargetAction() pulumi.StringOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringOutput { return v.TargetAction }).(pulumi.StringOutput)
}

// The name of the pipeline.
func (o WebhookOutput) TargetPipeline() pulumi.StringOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringOutput { return v.TargetPipeline }).(pulumi.StringOutput)
}

// The CodePipeline webhook's URL. POST events to this endpoint to trigger the target.
func (o WebhookOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

type WebhookArrayOutput struct{ *pulumi.OutputState }

func (WebhookArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Webhook)(nil)).Elem()
}

func (o WebhookArrayOutput) ToWebhookArrayOutput() WebhookArrayOutput {
	return o
}

func (o WebhookArrayOutput) ToWebhookArrayOutputWithContext(ctx context.Context) WebhookArrayOutput {
	return o
}

func (o WebhookArrayOutput) Index(i pulumi.IntInput) WebhookOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Webhook {
		return vs[0].([]*Webhook)[vs[1].(int)]
	}).(WebhookOutput)
}

type WebhookMapOutput struct{ *pulumi.OutputState }

func (WebhookMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Webhook)(nil)).Elem()
}

func (o WebhookMapOutput) ToWebhookMapOutput() WebhookMapOutput {
	return o
}

func (o WebhookMapOutput) ToWebhookMapOutputWithContext(ctx context.Context) WebhookMapOutput {
	return o
}

func (o WebhookMapOutput) MapIndex(k pulumi.StringInput) WebhookOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Webhook {
		return vs[0].(map[string]*Webhook)[vs[1].(string)]
	}).(WebhookOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WebhookInput)(nil)).Elem(), &Webhook{})
	pulumi.RegisterInputType(reflect.TypeOf((*WebhookArrayInput)(nil)).Elem(), WebhookArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WebhookMapInput)(nil)).Elem(), WebhookMap{})
	pulumi.RegisterOutputType(WebhookOutput{})
	pulumi.RegisterOutputType(WebhookArrayOutput{})
	pulumi.RegisterOutputType(WebhookMapOutput{})
}
