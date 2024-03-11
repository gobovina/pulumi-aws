// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package directoryservice

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Log subscription for AWS Directory Service that pushes logs to cloudwatch.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/cloudwatch"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/directoryservice"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := cloudwatch.NewLogGroup(ctx, "example", &cloudwatch.LogGroupArgs{
//				Name:            pulumi.String(fmt.Sprintf("/aws/directoryservice/%v", exampleAwsDirectoryServiceDirectory.Id)),
//				RetentionInDays: pulumi.Int(14),
//			})
//			if err != nil {
//				return err
//			}
//			ad_log_policy := iam.GetPolicyDocumentOutput(ctx, iam.GetPolicyDocumentOutputArgs{
//				Statements: iam.GetPolicyDocumentStatementArray{
//					&iam.GetPolicyDocumentStatementArgs{
//						Actions: pulumi.StringArray{
//							pulumi.String("logs:CreateLogStream"),
//							pulumi.String("logs:PutLogEvents"),
//						},
//						Principals: iam.GetPolicyDocumentStatementPrincipalArray{
//							&iam.GetPolicyDocumentStatementPrincipalArgs{
//								Identifiers: pulumi.StringArray{
//									pulumi.String("ds.amazonaws.com"),
//								},
//								Type: pulumi.String("Service"),
//							},
//						},
//						Resources: pulumi.StringArray{
//							example.Arn.ApplyT(func(arn string) (string, error) {
//								return fmt.Sprintf("%v:*", arn), nil
//							}).(pulumi.StringOutput),
//						},
//						Effect: pulumi.String("Allow"),
//					},
//				},
//			}, nil)
//			_, err = cloudwatch.NewLogResourcePolicy(ctx, "ad-log-policy", &cloudwatch.LogResourcePolicyArgs{
//				PolicyDocument: ad_log_policy.ApplyT(func(ad_log_policy iam.GetPolicyDocumentResult) (*string, error) {
//					return &ad_log_policy.Json, nil
//				}).(pulumi.StringPtrOutput),
//				PolicyName: pulumi.String("ad-log-policy"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = directoryservice.NewLogService(ctx, "example", &directoryservice.LogServiceArgs{
//				DirectoryId:  pulumi.Any(exampleAwsDirectoryServiceDirectory.Id),
//				LogGroupName: example.Name,
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
// Using `pulumi import`, import Directory Service Log Subscriptions using the directory id. For example:
//
// ```sh
// $ pulumi import aws:directoryservice/logService:LogService msad d-1234567890
// ```
type LogService struct {
	pulumi.CustomResourceState

	// ID of directory.
	DirectoryId pulumi.StringOutput `pulumi:"directoryId"`
	// Name of the cloudwatch log group to which the logs should be published. The log group should be already created and the directory service principal should be provided with required permission to create stream and publish logs. Changing this value would delete the current subscription and create a new one. A directory can only have one log subscription at a time.
	LogGroupName pulumi.StringOutput `pulumi:"logGroupName"`
}

// NewLogService registers a new resource with the given unique name, arguments, and options.
func NewLogService(ctx *pulumi.Context,
	name string, args *LogServiceArgs, opts ...pulumi.ResourceOption) (*LogService, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DirectoryId == nil {
		return nil, errors.New("invalid value for required argument 'DirectoryId'")
	}
	if args.LogGroupName == nil {
		return nil, errors.New("invalid value for required argument 'LogGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LogService
	err := ctx.RegisterResource("aws:directoryservice/logService:LogService", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLogService gets an existing LogService resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLogService(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LogServiceState, opts ...pulumi.ResourceOption) (*LogService, error) {
	var resource LogService
	err := ctx.ReadResource("aws:directoryservice/logService:LogService", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LogService resources.
type logServiceState struct {
	// ID of directory.
	DirectoryId *string `pulumi:"directoryId"`
	// Name of the cloudwatch log group to which the logs should be published. The log group should be already created and the directory service principal should be provided with required permission to create stream and publish logs. Changing this value would delete the current subscription and create a new one. A directory can only have one log subscription at a time.
	LogGroupName *string `pulumi:"logGroupName"`
}

type LogServiceState struct {
	// ID of directory.
	DirectoryId pulumi.StringPtrInput
	// Name of the cloudwatch log group to which the logs should be published. The log group should be already created and the directory service principal should be provided with required permission to create stream and publish logs. Changing this value would delete the current subscription and create a new one. A directory can only have one log subscription at a time.
	LogGroupName pulumi.StringPtrInput
}

func (LogServiceState) ElementType() reflect.Type {
	return reflect.TypeOf((*logServiceState)(nil)).Elem()
}

type logServiceArgs struct {
	// ID of directory.
	DirectoryId string `pulumi:"directoryId"`
	// Name of the cloudwatch log group to which the logs should be published. The log group should be already created and the directory service principal should be provided with required permission to create stream and publish logs. Changing this value would delete the current subscription and create a new one. A directory can only have one log subscription at a time.
	LogGroupName string `pulumi:"logGroupName"`
}

// The set of arguments for constructing a LogService resource.
type LogServiceArgs struct {
	// ID of directory.
	DirectoryId pulumi.StringInput
	// Name of the cloudwatch log group to which the logs should be published. The log group should be already created and the directory service principal should be provided with required permission to create stream and publish logs. Changing this value would delete the current subscription and create a new one. A directory can only have one log subscription at a time.
	LogGroupName pulumi.StringInput
}

func (LogServiceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*logServiceArgs)(nil)).Elem()
}

type LogServiceInput interface {
	pulumi.Input

	ToLogServiceOutput() LogServiceOutput
	ToLogServiceOutputWithContext(ctx context.Context) LogServiceOutput
}

func (*LogService) ElementType() reflect.Type {
	return reflect.TypeOf((**LogService)(nil)).Elem()
}

func (i *LogService) ToLogServiceOutput() LogServiceOutput {
	return i.ToLogServiceOutputWithContext(context.Background())
}

func (i *LogService) ToLogServiceOutputWithContext(ctx context.Context) LogServiceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogServiceOutput)
}

// LogServiceArrayInput is an input type that accepts LogServiceArray and LogServiceArrayOutput values.
// You can construct a concrete instance of `LogServiceArrayInput` via:
//
//	LogServiceArray{ LogServiceArgs{...} }
type LogServiceArrayInput interface {
	pulumi.Input

	ToLogServiceArrayOutput() LogServiceArrayOutput
	ToLogServiceArrayOutputWithContext(context.Context) LogServiceArrayOutput
}

type LogServiceArray []LogServiceInput

func (LogServiceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogService)(nil)).Elem()
}

func (i LogServiceArray) ToLogServiceArrayOutput() LogServiceArrayOutput {
	return i.ToLogServiceArrayOutputWithContext(context.Background())
}

func (i LogServiceArray) ToLogServiceArrayOutputWithContext(ctx context.Context) LogServiceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogServiceArrayOutput)
}

// LogServiceMapInput is an input type that accepts LogServiceMap and LogServiceMapOutput values.
// You can construct a concrete instance of `LogServiceMapInput` via:
//
//	LogServiceMap{ "key": LogServiceArgs{...} }
type LogServiceMapInput interface {
	pulumi.Input

	ToLogServiceMapOutput() LogServiceMapOutput
	ToLogServiceMapOutputWithContext(context.Context) LogServiceMapOutput
}

type LogServiceMap map[string]LogServiceInput

func (LogServiceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogService)(nil)).Elem()
}

func (i LogServiceMap) ToLogServiceMapOutput() LogServiceMapOutput {
	return i.ToLogServiceMapOutputWithContext(context.Background())
}

func (i LogServiceMap) ToLogServiceMapOutputWithContext(ctx context.Context) LogServiceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogServiceMapOutput)
}

type LogServiceOutput struct{ *pulumi.OutputState }

func (LogServiceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LogService)(nil)).Elem()
}

func (o LogServiceOutput) ToLogServiceOutput() LogServiceOutput {
	return o
}

func (o LogServiceOutput) ToLogServiceOutputWithContext(ctx context.Context) LogServiceOutput {
	return o
}

// ID of directory.
func (o LogServiceOutput) DirectoryId() pulumi.StringOutput {
	return o.ApplyT(func(v *LogService) pulumi.StringOutput { return v.DirectoryId }).(pulumi.StringOutput)
}

// Name of the cloudwatch log group to which the logs should be published. The log group should be already created and the directory service principal should be provided with required permission to create stream and publish logs. Changing this value would delete the current subscription and create a new one. A directory can only have one log subscription at a time.
func (o LogServiceOutput) LogGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *LogService) pulumi.StringOutput { return v.LogGroupName }).(pulumi.StringOutput)
}

type LogServiceArrayOutput struct{ *pulumi.OutputState }

func (LogServiceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogService)(nil)).Elem()
}

func (o LogServiceArrayOutput) ToLogServiceArrayOutput() LogServiceArrayOutput {
	return o
}

func (o LogServiceArrayOutput) ToLogServiceArrayOutputWithContext(ctx context.Context) LogServiceArrayOutput {
	return o
}

func (o LogServiceArrayOutput) Index(i pulumi.IntInput) LogServiceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LogService {
		return vs[0].([]*LogService)[vs[1].(int)]
	}).(LogServiceOutput)
}

type LogServiceMapOutput struct{ *pulumi.OutputState }

func (LogServiceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogService)(nil)).Elem()
}

func (o LogServiceMapOutput) ToLogServiceMapOutput() LogServiceMapOutput {
	return o
}

func (o LogServiceMapOutput) ToLogServiceMapOutputWithContext(ctx context.Context) LogServiceMapOutput {
	return o
}

func (o LogServiceMapOutput) MapIndex(k pulumi.StringInput) LogServiceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LogService {
		return vs[0].(map[string]*LogService)[vs[1].(string)]
	}).(LogServiceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LogServiceInput)(nil)).Elem(), &LogService{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogServiceArrayInput)(nil)).Elem(), LogServiceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogServiceMapInput)(nil)).Elem(), LogServiceMap{})
	pulumi.RegisterOutputType(LogServiceOutput{})
	pulumi.RegisterOutputType(LogServiceArrayOutput{})
	pulumi.RegisterOutputType(LogServiceMapOutput{})
}
