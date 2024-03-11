// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package amplify

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Amplify Branch resource.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/amplify"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := amplify.NewApp(ctx, "example", &amplify.AppArgs{
//				Name: pulumi.String("app"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = amplify.NewBranch(ctx, "master", &amplify.BranchArgs{
//				AppId:      example.ID(),
//				BranchName: pulumi.String("master"),
//				Framework:  pulumi.String("React"),
//				Stage:      pulumi.String("PRODUCTION"),
//				EnvironmentVariables: pulumi.StringMap{
//					"REACT_APP_API_SERVER": pulumi.String("https://api.example.com"),
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
// ### Basic Authentication
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/amplify"
//	"github.com/pulumi/pulumi-std/sdk/go/std"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := amplify.NewApp(ctx, "example", &amplify.AppArgs{
//				Name: pulumi.String("app"),
//			})
//			if err != nil {
//				return err
//			}
//			invokeBase64encode, err := std.Base64encode(ctx, &std.Base64encodeArgs{
//				Input: "username:password",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = amplify.NewBranch(ctx, "master", &amplify.BranchArgs{
//				AppId:                example.ID(),
//				BranchName:           pulumi.String("master"),
//				EnableBasicAuth:      pulumi.Bool(true),
//				BasicAuthCredentials: invokeBase64encode.Result,
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
// ### Notifications
//
// Amplify Console uses EventBridge (formerly known as CloudWatch Events) and SNS for email notifications.  To implement the same functionality, you need to set `enableNotification` in a `amplify.Branch` resource, as well as creating an EventBridge Rule, an SNS topic, and SNS subscriptions.
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"encoding/json"
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/amplify"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/cloudwatch"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/sns"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// example, err := amplify.NewApp(ctx, "example", &amplify.AppArgs{
// Name: pulumi.String("app"),
// })
// if err != nil {
// return err
// }
// master, err := amplify.NewBranch(ctx, "master", &amplify.BranchArgs{
// AppId: example.ID(),
// BranchName: pulumi.String("master"),
// EnableNotification: pulumi.Bool(true),
// })
// if err != nil {
// return err
// }
// // EventBridge Rule for Amplify notifications
// amplifyAppMasterEventRule, err := cloudwatch.NewEventRule(ctx, "amplify_app_master", &cloudwatch.EventRuleArgs{
// Name: master.BranchName.ApplyT(func(branchName string) (string, error) {
// return fmt.Sprintf("amplify-%v-%v-branch-notification", app.Id, branchName), nil
// }).(pulumi.StringOutput),
// Description: master.BranchName.ApplyT(func(branchName string) (string, error) {
// return fmt.Sprintf("AWS Amplify build notifications for :  App: %v Branch: %v", app.Id, branchName), nil
// }).(pulumi.StringOutput),
// EventPattern: pulumi.All(example.ID(),master.BranchName).ApplyT(func(_args []interface{}) (string, error) {
// id := _args[0].(string)
// branchName := _args[1].(string)
// var _zero string
// tmpJSON0, err := json.Marshal(map[string]interface{}{
// "detail": map[string]interface{}{
// "appId": []string{
// id,
// },
// "branchName": []string{
// branchName,
// },
// "jobStatus": []string{
// "SUCCEED",
// "FAILED",
// "STARTED",
// },
// },
// "detail-type": []string{
// "Amplify Deployment Status Change",
// },
// "source": []string{
// "aws.amplify",
// },
// })
// if err != nil {
// return _zero, err
// }
// json0 := string(tmpJSON0)
// return json0, nil
// }).(pulumi.StringOutput),
// })
// if err != nil {
// return err
// }
// // SNS Topic for Amplify notifications
// amplifyAppMasterTopic, err := sns.NewTopic(ctx, "amplify_app_master", &sns.TopicArgs{
// Name: master.BranchName.ApplyT(func(branchName string) (string, error) {
// return fmt.Sprintf("amplify-%v_%v", app.Id, branchName), nil
// }).(pulumi.StringOutput),
// })
// if err != nil {
// return err
// }
// _, err = cloudwatch.NewEventTarget(ctx, "amplify_app_master", &cloudwatch.EventTargetArgs{
// Rule: amplifyAppMasterEventRule.Name,
// TargetId: master.BranchName,
// Arn: amplifyAppMasterTopic.Arn,
// InputTransformer: &cloudwatch.EventTargetInputTransformerArgs{
// InputPaths: pulumi.StringMap{
// "jobId": pulumi.String("$.detail.jobId"),
// "appId": pulumi.String("$.detail.appId"),
// "region": pulumi.String("$.region"),
// "branch": pulumi.String("$.detail.branchName"),
// "status": pulumi.String("$.detail.jobStatus"),
// },
// InputTemplate: pulumi.String("\"Build notification from the AWS Amplify Console for app: https://<branch>.<appId>.amplifyapp.com/. Your build status is <status>. Go to https://console.aws.amazon.com/amplify/home?region=<region>#<appId>/<branch>/<jobId> to view details on your build. \""),
// },
// })
// if err != nil {
// return err
// }
// amplifyAppMaster := pulumi.All(master.Arn,amplifyAppMasterTopic.Arn).ApplyT(func(_args []interface{}) (iam.GetPolicyDocumentResult, error) {
// masterArn := _args[0].(string)
// amplifyAppMasterTopicArn := _args[1].(string)
// return iam.GetPolicyDocumentOutput(ctx, iam.GetPolicyDocumentOutputArgs{
// Statements: []iam.GetPolicyDocumentStatement{
// {
// Sid: fmt.Sprintf("Allow_Publish_Events %v", masterArn),
// Effect: "Allow",
// Actions: []string{
// "SNS:Publish",
// },
// Principals: []iam.GetPolicyDocumentStatementPrincipal{
// {
// Type: "Service",
// Identifiers: []string{
// "events.amazonaws.com",
// },
// },
// },
// Resources: interface{}{
// amplifyAppMasterTopicArn,
// },
// },
// },
// }, nil), nil
// }).(iam.GetPolicyDocumentResultOutput)
// _, err = sns.NewTopicPolicy(ctx, "amplify_app_master", &sns.TopicPolicyArgs{
// Arn: amplifyAppMasterTopic.Arn,
// Policy: amplifyAppMaster.ApplyT(func(amplifyAppMaster iam.GetPolicyDocumentResult) (*string, error) {
// return &amplifyAppMaster.Json, nil
// }).(pulumi.StringPtrOutput),
// })
// if err != nil {
// return err
// }
// _, err = sns.NewTopicSubscription(ctx, "this", &sns.TopicSubscriptionArgs{
// Topic: amplifyAppMasterTopic.Arn,
// Protocol: pulumi.String("email"),
// Endpoint: pulumi.String("user@acme.com"),
// })
// if err != nil {
// return err
// }
// return nil
// })
// }
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Using `pulumi import`, import Amplify branch using `app_id` and `branch_name`. For example:
//
// ```sh
// $ pulumi import aws:amplify/branch:Branch master d2ypk4k47z8u6/master
// ```
type Branch struct {
	pulumi.CustomResourceState

	// Unique ID for an Amplify app.
	AppId pulumi.StringOutput `pulumi:"appId"`
	// ARN for the branch.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// A list of custom resources that are linked to this branch.
	AssociatedResources pulumi.StringArrayOutput `pulumi:"associatedResources"`
	// ARN for a backend environment that is part of an Amplify app.
	BackendEnvironmentArn pulumi.StringPtrOutput `pulumi:"backendEnvironmentArn"`
	// Basic authorization credentials for the branch.
	BasicAuthCredentials pulumi.StringPtrOutput `pulumi:"basicAuthCredentials"`
	// Name for the branch.
	BranchName pulumi.StringOutput `pulumi:"branchName"`
	// Custom domains for the branch.
	CustomDomains pulumi.StringArrayOutput `pulumi:"customDomains"`
	// Description for the branch.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Destination branch if the branch is a pull request branch.
	DestinationBranch pulumi.StringOutput `pulumi:"destinationBranch"`
	// Display name for a branch. This is used as the default domain prefix.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Enables auto building for the branch.
	EnableAutoBuild pulumi.BoolPtrOutput `pulumi:"enableAutoBuild"`
	// Enables basic authorization for the branch.
	EnableBasicAuth pulumi.BoolPtrOutput `pulumi:"enableBasicAuth"`
	// Enables notifications for the branch.
	EnableNotification pulumi.BoolPtrOutput `pulumi:"enableNotification"`
	// Enables performance mode for the branch.
	EnablePerformanceMode pulumi.BoolPtrOutput `pulumi:"enablePerformanceMode"`
	// Enables pull request previews for this branch.
	EnablePullRequestPreview pulumi.BoolPtrOutput `pulumi:"enablePullRequestPreview"`
	// Environment variables for the branch.
	EnvironmentVariables pulumi.StringMapOutput `pulumi:"environmentVariables"`
	// Framework for the branch.
	Framework pulumi.StringPtrOutput `pulumi:"framework"`
	// Amplify environment name for the pull request.
	PullRequestEnvironmentName pulumi.StringPtrOutput `pulumi:"pullRequestEnvironmentName"`
	// Source branch if the branch is a pull request branch.
	SourceBranch pulumi.StringOutput `pulumi:"sourceBranch"`
	// Describes the current stage for the branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
	Stage pulumi.StringPtrOutput `pulumi:"stage"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Content Time To Live (TTL) for the website in seconds.
	Ttl pulumi.StringPtrOutput `pulumi:"ttl"`
}

// NewBranch registers a new resource with the given unique name, arguments, and options.
func NewBranch(ctx *pulumi.Context,
	name string, args *BranchArgs, opts ...pulumi.ResourceOption) (*Branch, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AppId == nil {
		return nil, errors.New("invalid value for required argument 'AppId'")
	}
	if args.BranchName == nil {
		return nil, errors.New("invalid value for required argument 'BranchName'")
	}
	if args.BasicAuthCredentials != nil {
		args.BasicAuthCredentials = pulumi.ToSecret(args.BasicAuthCredentials).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"basicAuthCredentials",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Branch
	err := ctx.RegisterResource("aws:amplify/branch:Branch", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBranch gets an existing Branch resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBranch(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BranchState, opts ...pulumi.ResourceOption) (*Branch, error) {
	var resource Branch
	err := ctx.ReadResource("aws:amplify/branch:Branch", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Branch resources.
type branchState struct {
	// Unique ID for an Amplify app.
	AppId *string `pulumi:"appId"`
	// ARN for the branch.
	Arn *string `pulumi:"arn"`
	// A list of custom resources that are linked to this branch.
	AssociatedResources []string `pulumi:"associatedResources"`
	// ARN for a backend environment that is part of an Amplify app.
	BackendEnvironmentArn *string `pulumi:"backendEnvironmentArn"`
	// Basic authorization credentials for the branch.
	BasicAuthCredentials *string `pulumi:"basicAuthCredentials"`
	// Name for the branch.
	BranchName *string `pulumi:"branchName"`
	// Custom domains for the branch.
	CustomDomains []string `pulumi:"customDomains"`
	// Description for the branch.
	Description *string `pulumi:"description"`
	// Destination branch if the branch is a pull request branch.
	DestinationBranch *string `pulumi:"destinationBranch"`
	// Display name for a branch. This is used as the default domain prefix.
	DisplayName *string `pulumi:"displayName"`
	// Enables auto building for the branch.
	EnableAutoBuild *bool `pulumi:"enableAutoBuild"`
	// Enables basic authorization for the branch.
	EnableBasicAuth *bool `pulumi:"enableBasicAuth"`
	// Enables notifications for the branch.
	EnableNotification *bool `pulumi:"enableNotification"`
	// Enables performance mode for the branch.
	EnablePerformanceMode *bool `pulumi:"enablePerformanceMode"`
	// Enables pull request previews for this branch.
	EnablePullRequestPreview *bool `pulumi:"enablePullRequestPreview"`
	// Environment variables for the branch.
	EnvironmentVariables map[string]string `pulumi:"environmentVariables"`
	// Framework for the branch.
	Framework *string `pulumi:"framework"`
	// Amplify environment name for the pull request.
	PullRequestEnvironmentName *string `pulumi:"pullRequestEnvironmentName"`
	// Source branch if the branch is a pull request branch.
	SourceBranch *string `pulumi:"sourceBranch"`
	// Describes the current stage for the branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
	Stage *string `pulumi:"stage"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Content Time To Live (TTL) for the website in seconds.
	Ttl *string `pulumi:"ttl"`
}

type BranchState struct {
	// Unique ID for an Amplify app.
	AppId pulumi.StringPtrInput
	// ARN for the branch.
	Arn pulumi.StringPtrInput
	// A list of custom resources that are linked to this branch.
	AssociatedResources pulumi.StringArrayInput
	// ARN for a backend environment that is part of an Amplify app.
	BackendEnvironmentArn pulumi.StringPtrInput
	// Basic authorization credentials for the branch.
	BasicAuthCredentials pulumi.StringPtrInput
	// Name for the branch.
	BranchName pulumi.StringPtrInput
	// Custom domains for the branch.
	CustomDomains pulumi.StringArrayInput
	// Description for the branch.
	Description pulumi.StringPtrInput
	// Destination branch if the branch is a pull request branch.
	DestinationBranch pulumi.StringPtrInput
	// Display name for a branch. This is used as the default domain prefix.
	DisplayName pulumi.StringPtrInput
	// Enables auto building for the branch.
	EnableAutoBuild pulumi.BoolPtrInput
	// Enables basic authorization for the branch.
	EnableBasicAuth pulumi.BoolPtrInput
	// Enables notifications for the branch.
	EnableNotification pulumi.BoolPtrInput
	// Enables performance mode for the branch.
	EnablePerformanceMode pulumi.BoolPtrInput
	// Enables pull request previews for this branch.
	EnablePullRequestPreview pulumi.BoolPtrInput
	// Environment variables for the branch.
	EnvironmentVariables pulumi.StringMapInput
	// Framework for the branch.
	Framework pulumi.StringPtrInput
	// Amplify environment name for the pull request.
	PullRequestEnvironmentName pulumi.StringPtrInput
	// Source branch if the branch is a pull request branch.
	SourceBranch pulumi.StringPtrInput
	// Describes the current stage for the branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
	Stage pulumi.StringPtrInput
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// Content Time To Live (TTL) for the website in seconds.
	Ttl pulumi.StringPtrInput
}

func (BranchState) ElementType() reflect.Type {
	return reflect.TypeOf((*branchState)(nil)).Elem()
}

type branchArgs struct {
	// Unique ID for an Amplify app.
	AppId string `pulumi:"appId"`
	// ARN for a backend environment that is part of an Amplify app.
	BackendEnvironmentArn *string `pulumi:"backendEnvironmentArn"`
	// Basic authorization credentials for the branch.
	BasicAuthCredentials *string `pulumi:"basicAuthCredentials"`
	// Name for the branch.
	BranchName string `pulumi:"branchName"`
	// Description for the branch.
	Description *string `pulumi:"description"`
	// Display name for a branch. This is used as the default domain prefix.
	DisplayName *string `pulumi:"displayName"`
	// Enables auto building for the branch.
	EnableAutoBuild *bool `pulumi:"enableAutoBuild"`
	// Enables basic authorization for the branch.
	EnableBasicAuth *bool `pulumi:"enableBasicAuth"`
	// Enables notifications for the branch.
	EnableNotification *bool `pulumi:"enableNotification"`
	// Enables performance mode for the branch.
	EnablePerformanceMode *bool `pulumi:"enablePerformanceMode"`
	// Enables pull request previews for this branch.
	EnablePullRequestPreview *bool `pulumi:"enablePullRequestPreview"`
	// Environment variables for the branch.
	EnvironmentVariables map[string]string `pulumi:"environmentVariables"`
	// Framework for the branch.
	Framework *string `pulumi:"framework"`
	// Amplify environment name for the pull request.
	PullRequestEnvironmentName *string `pulumi:"pullRequestEnvironmentName"`
	// Describes the current stage for the branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
	Stage *string `pulumi:"stage"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Content Time To Live (TTL) for the website in seconds.
	Ttl *string `pulumi:"ttl"`
}

// The set of arguments for constructing a Branch resource.
type BranchArgs struct {
	// Unique ID for an Amplify app.
	AppId pulumi.StringInput
	// ARN for a backend environment that is part of an Amplify app.
	BackendEnvironmentArn pulumi.StringPtrInput
	// Basic authorization credentials for the branch.
	BasicAuthCredentials pulumi.StringPtrInput
	// Name for the branch.
	BranchName pulumi.StringInput
	// Description for the branch.
	Description pulumi.StringPtrInput
	// Display name for a branch. This is used as the default domain prefix.
	DisplayName pulumi.StringPtrInput
	// Enables auto building for the branch.
	EnableAutoBuild pulumi.BoolPtrInput
	// Enables basic authorization for the branch.
	EnableBasicAuth pulumi.BoolPtrInput
	// Enables notifications for the branch.
	EnableNotification pulumi.BoolPtrInput
	// Enables performance mode for the branch.
	EnablePerformanceMode pulumi.BoolPtrInput
	// Enables pull request previews for this branch.
	EnablePullRequestPreview pulumi.BoolPtrInput
	// Environment variables for the branch.
	EnvironmentVariables pulumi.StringMapInput
	// Framework for the branch.
	Framework pulumi.StringPtrInput
	// Amplify environment name for the pull request.
	PullRequestEnvironmentName pulumi.StringPtrInput
	// Describes the current stage for the branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
	Stage pulumi.StringPtrInput
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Content Time To Live (TTL) for the website in seconds.
	Ttl pulumi.StringPtrInput
}

func (BranchArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*branchArgs)(nil)).Elem()
}

type BranchInput interface {
	pulumi.Input

	ToBranchOutput() BranchOutput
	ToBranchOutputWithContext(ctx context.Context) BranchOutput
}

func (*Branch) ElementType() reflect.Type {
	return reflect.TypeOf((**Branch)(nil)).Elem()
}

func (i *Branch) ToBranchOutput() BranchOutput {
	return i.ToBranchOutputWithContext(context.Background())
}

func (i *Branch) ToBranchOutputWithContext(ctx context.Context) BranchOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BranchOutput)
}

// BranchArrayInput is an input type that accepts BranchArray and BranchArrayOutput values.
// You can construct a concrete instance of `BranchArrayInput` via:
//
//	BranchArray{ BranchArgs{...} }
type BranchArrayInput interface {
	pulumi.Input

	ToBranchArrayOutput() BranchArrayOutput
	ToBranchArrayOutputWithContext(context.Context) BranchArrayOutput
}

type BranchArray []BranchInput

func (BranchArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Branch)(nil)).Elem()
}

func (i BranchArray) ToBranchArrayOutput() BranchArrayOutput {
	return i.ToBranchArrayOutputWithContext(context.Background())
}

func (i BranchArray) ToBranchArrayOutputWithContext(ctx context.Context) BranchArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BranchArrayOutput)
}

// BranchMapInput is an input type that accepts BranchMap and BranchMapOutput values.
// You can construct a concrete instance of `BranchMapInput` via:
//
//	BranchMap{ "key": BranchArgs{...} }
type BranchMapInput interface {
	pulumi.Input

	ToBranchMapOutput() BranchMapOutput
	ToBranchMapOutputWithContext(context.Context) BranchMapOutput
}

type BranchMap map[string]BranchInput

func (BranchMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Branch)(nil)).Elem()
}

func (i BranchMap) ToBranchMapOutput() BranchMapOutput {
	return i.ToBranchMapOutputWithContext(context.Background())
}

func (i BranchMap) ToBranchMapOutputWithContext(ctx context.Context) BranchMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BranchMapOutput)
}

type BranchOutput struct{ *pulumi.OutputState }

func (BranchOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Branch)(nil)).Elem()
}

func (o BranchOutput) ToBranchOutput() BranchOutput {
	return o
}

func (o BranchOutput) ToBranchOutputWithContext(ctx context.Context) BranchOutput {
	return o
}

// Unique ID for an Amplify app.
func (o BranchOutput) AppId() pulumi.StringOutput {
	return o.ApplyT(func(v *Branch) pulumi.StringOutput { return v.AppId }).(pulumi.StringOutput)
}

// ARN for the branch.
func (o BranchOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Branch) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// A list of custom resources that are linked to this branch.
func (o BranchOutput) AssociatedResources() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Branch) pulumi.StringArrayOutput { return v.AssociatedResources }).(pulumi.StringArrayOutput)
}

// ARN for a backend environment that is part of an Amplify app.
func (o BranchOutput) BackendEnvironmentArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Branch) pulumi.StringPtrOutput { return v.BackendEnvironmentArn }).(pulumi.StringPtrOutput)
}

// Basic authorization credentials for the branch.
func (o BranchOutput) BasicAuthCredentials() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Branch) pulumi.StringPtrOutput { return v.BasicAuthCredentials }).(pulumi.StringPtrOutput)
}

// Name for the branch.
func (o BranchOutput) BranchName() pulumi.StringOutput {
	return o.ApplyT(func(v *Branch) pulumi.StringOutput { return v.BranchName }).(pulumi.StringOutput)
}

// Custom domains for the branch.
func (o BranchOutput) CustomDomains() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Branch) pulumi.StringArrayOutput { return v.CustomDomains }).(pulumi.StringArrayOutput)
}

// Description for the branch.
func (o BranchOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Branch) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Destination branch if the branch is a pull request branch.
func (o BranchOutput) DestinationBranch() pulumi.StringOutput {
	return o.ApplyT(func(v *Branch) pulumi.StringOutput { return v.DestinationBranch }).(pulumi.StringOutput)
}

// Display name for a branch. This is used as the default domain prefix.
func (o BranchOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *Branch) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// Enables auto building for the branch.
func (o BranchOutput) EnableAutoBuild() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Branch) pulumi.BoolPtrOutput { return v.EnableAutoBuild }).(pulumi.BoolPtrOutput)
}

// Enables basic authorization for the branch.
func (o BranchOutput) EnableBasicAuth() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Branch) pulumi.BoolPtrOutput { return v.EnableBasicAuth }).(pulumi.BoolPtrOutput)
}

// Enables notifications for the branch.
func (o BranchOutput) EnableNotification() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Branch) pulumi.BoolPtrOutput { return v.EnableNotification }).(pulumi.BoolPtrOutput)
}

// Enables performance mode for the branch.
func (o BranchOutput) EnablePerformanceMode() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Branch) pulumi.BoolPtrOutput { return v.EnablePerformanceMode }).(pulumi.BoolPtrOutput)
}

// Enables pull request previews for this branch.
func (o BranchOutput) EnablePullRequestPreview() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Branch) pulumi.BoolPtrOutput { return v.EnablePullRequestPreview }).(pulumi.BoolPtrOutput)
}

// Environment variables for the branch.
func (o BranchOutput) EnvironmentVariables() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Branch) pulumi.StringMapOutput { return v.EnvironmentVariables }).(pulumi.StringMapOutput)
}

// Framework for the branch.
func (o BranchOutput) Framework() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Branch) pulumi.StringPtrOutput { return v.Framework }).(pulumi.StringPtrOutput)
}

// Amplify environment name for the pull request.
func (o BranchOutput) PullRequestEnvironmentName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Branch) pulumi.StringPtrOutput { return v.PullRequestEnvironmentName }).(pulumi.StringPtrOutput)
}

// Source branch if the branch is a pull request branch.
func (o BranchOutput) SourceBranch() pulumi.StringOutput {
	return o.ApplyT(func(v *Branch) pulumi.StringOutput { return v.SourceBranch }).(pulumi.StringOutput)
}

// Describes the current stage for the branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
func (o BranchOutput) Stage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Branch) pulumi.StringPtrOutput { return v.Stage }).(pulumi.StringPtrOutput)
}

// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o BranchOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Branch) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o BranchOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Branch) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Content Time To Live (TTL) for the website in seconds.
func (o BranchOutput) Ttl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Branch) pulumi.StringPtrOutput { return v.Ttl }).(pulumi.StringPtrOutput)
}

type BranchArrayOutput struct{ *pulumi.OutputState }

func (BranchArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Branch)(nil)).Elem()
}

func (o BranchArrayOutput) ToBranchArrayOutput() BranchArrayOutput {
	return o
}

func (o BranchArrayOutput) ToBranchArrayOutputWithContext(ctx context.Context) BranchArrayOutput {
	return o
}

func (o BranchArrayOutput) Index(i pulumi.IntInput) BranchOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Branch {
		return vs[0].([]*Branch)[vs[1].(int)]
	}).(BranchOutput)
}

type BranchMapOutput struct{ *pulumi.OutputState }

func (BranchMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Branch)(nil)).Elem()
}

func (o BranchMapOutput) ToBranchMapOutput() BranchMapOutput {
	return o
}

func (o BranchMapOutput) ToBranchMapOutputWithContext(ctx context.Context) BranchMapOutput {
	return o
}

func (o BranchMapOutput) MapIndex(k pulumi.StringInput) BranchOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Branch {
		return vs[0].(map[string]*Branch)[vs[1].(string)]
	}).(BranchOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BranchInput)(nil)).Elem(), &Branch{})
	pulumi.RegisterInputType(reflect.TypeOf((*BranchArrayInput)(nil)).Elem(), BranchArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BranchMapInput)(nil)).Elem(), BranchMap{})
	pulumi.RegisterOutputType(BranchOutput{})
	pulumi.RegisterOutputType(BranchArrayOutput{})
	pulumi.RegisterOutputType(BranchMapOutput{})
}
