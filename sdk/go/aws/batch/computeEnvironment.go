// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package batch

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates a AWS Batch compute environment. Compute environments contain the Amazon ECS container instances that are used to run containerized batch jobs.
//
// For information about AWS Batch, see [What is AWS Batch?](http://docs.aws.amazon.com/batch/latest/userguide/what-is-batch.html) .
// For information about compute environment, see [Compute Environments](http://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html) .
//
// > **Note:** To prevent a race condition during environment deletion, make sure to set `dependsOn` to the related `iam.RolePolicyAttachment`;
// otherwise, the policy may be destroyed too soon and the compute environment will then get stuck in the `DELETING` state, see [Troubleshooting AWS Batch](http://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html) .
//
// ## Example Usage
// ### EC2 Type
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/batch"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ec2"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ec2AssumeRole, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
//				Statements: []iam.GetPolicyDocumentStatement{
//					{
//						Effect: pulumi.StringRef("Allow"),
//						Principals: []iam.GetPolicyDocumentStatementPrincipal{
//							{
//								Type: "Service",
//								Identifiers: []string{
//									"ec2.amazonaws.com",
//								},
//							},
//						},
//						Actions: []string{
//							"sts:AssumeRole",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ecsInstanceRoleRole, err := iam.NewRole(ctx, "ecsInstanceRoleRole", &iam.RoleArgs{
//				AssumeRolePolicy: *pulumi.String(ec2AssumeRole.Json),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = iam.NewRolePolicyAttachment(ctx, "ecsInstanceRoleRolePolicyAttachment", &iam.RolePolicyAttachmentArgs{
//				Role:      ecsInstanceRoleRole.Name,
//				PolicyArn: pulumi.String("arn:aws:iam::aws:policy/service-role/AmazonEC2ContainerServiceforEC2Role"),
//			})
//			if err != nil {
//				return err
//			}
//			ecsInstanceRoleInstanceProfile, err := iam.NewInstanceProfile(ctx, "ecsInstanceRoleInstanceProfile", &iam.InstanceProfileArgs{
//				Role: ecsInstanceRoleRole.Name,
//			})
//			if err != nil {
//				return err
//			}
//			batchAssumeRole, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
//				Statements: []iam.GetPolicyDocumentStatement{
//					{
//						Effect: pulumi.StringRef("Allow"),
//						Principals: []iam.GetPolicyDocumentStatementPrincipal{
//							{
//								Type: "Service",
//								Identifiers: []string{
//									"batch.amazonaws.com",
//								},
//							},
//						},
//						Actions: []string{
//							"sts:AssumeRole",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			awsBatchServiceRoleRole, err := iam.NewRole(ctx, "awsBatchServiceRoleRole", &iam.RoleArgs{
//				AssumeRolePolicy: *pulumi.String(batchAssumeRole.Json),
//			})
//			if err != nil {
//				return err
//			}
//			awsBatchServiceRoleRolePolicyAttachment, err := iam.NewRolePolicyAttachment(ctx, "awsBatchServiceRoleRolePolicyAttachment", &iam.RolePolicyAttachmentArgs{
//				Role:      awsBatchServiceRoleRole.Name,
//				PolicyArn: pulumi.String("arn:aws:iam::aws:policy/service-role/AWSBatchServiceRole"),
//			})
//			if err != nil {
//				return err
//			}
//			sampleSecurityGroup, err := ec2.NewSecurityGroup(ctx, "sampleSecurityGroup", &ec2.SecurityGroupArgs{
//				Egress: ec2.SecurityGroupEgressArray{
//					&ec2.SecurityGroupEgressArgs{
//						FromPort: pulumi.Int(0),
//						ToPort:   pulumi.Int(0),
//						Protocol: pulumi.String("-1"),
//						CidrBlocks: pulumi.StringArray{
//							pulumi.String("0.0.0.0/0"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			sampleVpc, err := ec2.NewVpc(ctx, "sampleVpc", &ec2.VpcArgs{
//				CidrBlock: pulumi.String("10.1.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			sampleSubnet, err := ec2.NewSubnet(ctx, "sampleSubnet", &ec2.SubnetArgs{
//				VpcId:     sampleVpc.ID(),
//				CidrBlock: pulumi.String("10.1.1.0/24"),
//			})
//			if err != nil {
//				return err
//			}
//			samplePlacementGroup, err := ec2.NewPlacementGroup(ctx, "samplePlacementGroup", &ec2.PlacementGroupArgs{
//				Strategy: pulumi.String("cluster"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = batch.NewComputeEnvironment(ctx, "sampleComputeEnvironment", &batch.ComputeEnvironmentArgs{
//				ComputeEnvironmentName: pulumi.String("sample"),
//				ComputeResources: &batch.ComputeEnvironmentComputeResourcesArgs{
//					InstanceRole: ecsInstanceRoleInstanceProfile.Arn,
//					InstanceTypes: pulumi.StringArray{
//						pulumi.String("c4.large"),
//					},
//					MaxVcpus:       pulumi.Int(16),
//					MinVcpus:       pulumi.Int(0),
//					PlacementGroup: samplePlacementGroup.Name,
//					SecurityGroupIds: pulumi.StringArray{
//						sampleSecurityGroup.ID(),
//					},
//					Subnets: pulumi.StringArray{
//						sampleSubnet.ID(),
//					},
//					Type: pulumi.String("EC2"),
//				},
//				ServiceRole: awsBatchServiceRoleRole.Arn,
//				Type:        pulumi.String("MANAGED"),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				awsBatchServiceRoleRolePolicyAttachment,
//			}))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Fargate Type
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/batch"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := batch.NewComputeEnvironment(ctx, "sample", &batch.ComputeEnvironmentArgs{
//				ComputeEnvironmentName: pulumi.String("sample"),
//				ComputeResources: &batch.ComputeEnvironmentComputeResourcesArgs{
//					MaxVcpus: pulumi.Int(16),
//					SecurityGroupIds: pulumi.StringArray{
//						aws_security_group.Sample.Id,
//					},
//					Subnets: pulumi.StringArray{
//						aws_subnet.Sample.Id,
//					},
//					Type: pulumi.String("FARGATE"),
//				},
//				ServiceRole: pulumi.Any(aws_iam_role.Aws_batch_service_role.Arn),
//				Type:        pulumi.String("MANAGED"),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				aws_iam_role_policy_attachment.Aws_batch_service_role,
//			}))
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
// Using `pulumi import`, import AWS Batch compute using the `compute_environment_name`. For example:
//
// ```sh
//
//	$ pulumi import aws:batch/computeEnvironment:ComputeEnvironment sample sample
//
// ```
type ComputeEnvironment struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) of the compute environment.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed. If omitted, the provider will assign a random, unique name.
	ComputeEnvironmentName pulumi.StringOutput `pulumi:"computeEnvironmentName"`
	// Creates a unique compute environment name beginning with the specified prefix. Conflicts with `computeEnvironmentName`.
	ComputeEnvironmentNamePrefix pulumi.StringOutput `pulumi:"computeEnvironmentNamePrefix"`
	// Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
	ComputeResources ComputeEnvironmentComputeResourcesPtrOutput `pulumi:"computeResources"`
	// The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
	EcsClusterArn pulumi.StringOutput `pulumi:"ecsClusterArn"`
	// Details for the Amazon EKS cluster that supports the compute environment. See details below.
	EksConfiguration ComputeEnvironmentEksConfigurationPtrOutput `pulumi:"eksConfiguration"`
	// The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
	ServiceRole pulumi.StringOutput `pulumi:"serviceRole"`
	// The state of the compute environment. If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. Valid items are `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
	State pulumi.StringPtrOutput `pulumi:"state"`
	// The current status of the compute environment (for example, CREATING or VALID).
	Status pulumi.StringOutput `pulumi:"status"`
	// A short, human-readable string to provide additional details about the current status of the compute environment.
	StatusReason pulumi.StringOutput `pulumi:"statusReason"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The type of the compute environment. Valid items are `MANAGED` or `UNMANAGED`.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewComputeEnvironment registers a new resource with the given unique name, arguments, and options.
func NewComputeEnvironment(ctx *pulumi.Context,
	name string, args *ComputeEnvironmentArgs, opts ...pulumi.ResourceOption) (*ComputeEnvironment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ComputeEnvironment
	err := ctx.RegisterResource("aws:batch/computeEnvironment:ComputeEnvironment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetComputeEnvironment gets an existing ComputeEnvironment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetComputeEnvironment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ComputeEnvironmentState, opts ...pulumi.ResourceOption) (*ComputeEnvironment, error) {
	var resource ComputeEnvironment
	err := ctx.ReadResource("aws:batch/computeEnvironment:ComputeEnvironment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ComputeEnvironment resources.
type computeEnvironmentState struct {
	// The Amazon Resource Name (ARN) of the compute environment.
	Arn *string `pulumi:"arn"`
	// The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed. If omitted, the provider will assign a random, unique name.
	ComputeEnvironmentName *string `pulumi:"computeEnvironmentName"`
	// Creates a unique compute environment name beginning with the specified prefix. Conflicts with `computeEnvironmentName`.
	ComputeEnvironmentNamePrefix *string `pulumi:"computeEnvironmentNamePrefix"`
	// Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
	ComputeResources *ComputeEnvironmentComputeResources `pulumi:"computeResources"`
	// The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
	EcsClusterArn *string `pulumi:"ecsClusterArn"`
	// Details for the Amazon EKS cluster that supports the compute environment. See details below.
	EksConfiguration *ComputeEnvironmentEksConfiguration `pulumi:"eksConfiguration"`
	// The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
	ServiceRole *string `pulumi:"serviceRole"`
	// The state of the compute environment. If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. Valid items are `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
	State *string `pulumi:"state"`
	// The current status of the compute environment (for example, CREATING or VALID).
	Status *string `pulumi:"status"`
	// A short, human-readable string to provide additional details about the current status of the compute environment.
	StatusReason *string `pulumi:"statusReason"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The type of the compute environment. Valid items are `MANAGED` or `UNMANAGED`.
	Type *string `pulumi:"type"`
}

type ComputeEnvironmentState struct {
	// The Amazon Resource Name (ARN) of the compute environment.
	Arn pulumi.StringPtrInput
	// The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed. If omitted, the provider will assign a random, unique name.
	ComputeEnvironmentName pulumi.StringPtrInput
	// Creates a unique compute environment name beginning with the specified prefix. Conflicts with `computeEnvironmentName`.
	ComputeEnvironmentNamePrefix pulumi.StringPtrInput
	// Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
	ComputeResources ComputeEnvironmentComputeResourcesPtrInput
	// The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
	EcsClusterArn pulumi.StringPtrInput
	// Details for the Amazon EKS cluster that supports the compute environment. See details below.
	EksConfiguration ComputeEnvironmentEksConfigurationPtrInput
	// The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
	ServiceRole pulumi.StringPtrInput
	// The state of the compute environment. If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. Valid items are `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
	State pulumi.StringPtrInput
	// The current status of the compute environment (for example, CREATING or VALID).
	Status pulumi.StringPtrInput
	// A short, human-readable string to provide additional details about the current status of the compute environment.
	StatusReason pulumi.StringPtrInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
	// The type of the compute environment. Valid items are `MANAGED` or `UNMANAGED`.
	Type pulumi.StringPtrInput
}

func (ComputeEnvironmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*computeEnvironmentState)(nil)).Elem()
}

type computeEnvironmentArgs struct {
	// The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed. If omitted, the provider will assign a random, unique name.
	ComputeEnvironmentName *string `pulumi:"computeEnvironmentName"`
	// Creates a unique compute environment name beginning with the specified prefix. Conflicts with `computeEnvironmentName`.
	ComputeEnvironmentNamePrefix *string `pulumi:"computeEnvironmentNamePrefix"`
	// Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
	ComputeResources *ComputeEnvironmentComputeResources `pulumi:"computeResources"`
	// Details for the Amazon EKS cluster that supports the compute environment. See details below.
	EksConfiguration *ComputeEnvironmentEksConfiguration `pulumi:"eksConfiguration"`
	// The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
	ServiceRole *string `pulumi:"serviceRole"`
	// The state of the compute environment. If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. Valid items are `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
	State *string `pulumi:"state"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// The type of the compute environment. Valid items are `MANAGED` or `UNMANAGED`.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a ComputeEnvironment resource.
type ComputeEnvironmentArgs struct {
	// The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed. If omitted, the provider will assign a random, unique name.
	ComputeEnvironmentName pulumi.StringPtrInput
	// Creates a unique compute environment name beginning with the specified prefix. Conflicts with `computeEnvironmentName`.
	ComputeEnvironmentNamePrefix pulumi.StringPtrInput
	// Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
	ComputeResources ComputeEnvironmentComputeResourcesPtrInput
	// Details for the Amazon EKS cluster that supports the compute environment. See details below.
	EksConfiguration ComputeEnvironmentEksConfigurationPtrInput
	// The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
	ServiceRole pulumi.StringPtrInput
	// The state of the compute environment. If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. Valid items are `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
	State pulumi.StringPtrInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// The type of the compute environment. Valid items are `MANAGED` or `UNMANAGED`.
	Type pulumi.StringInput
}

func (ComputeEnvironmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*computeEnvironmentArgs)(nil)).Elem()
}

type ComputeEnvironmentInput interface {
	pulumi.Input

	ToComputeEnvironmentOutput() ComputeEnvironmentOutput
	ToComputeEnvironmentOutputWithContext(ctx context.Context) ComputeEnvironmentOutput
}

func (*ComputeEnvironment) ElementType() reflect.Type {
	return reflect.TypeOf((**ComputeEnvironment)(nil)).Elem()
}

func (i *ComputeEnvironment) ToComputeEnvironmentOutput() ComputeEnvironmentOutput {
	return i.ToComputeEnvironmentOutputWithContext(context.Background())
}

func (i *ComputeEnvironment) ToComputeEnvironmentOutputWithContext(ctx context.Context) ComputeEnvironmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ComputeEnvironmentOutput)
}

// ComputeEnvironmentArrayInput is an input type that accepts ComputeEnvironmentArray and ComputeEnvironmentArrayOutput values.
// You can construct a concrete instance of `ComputeEnvironmentArrayInput` via:
//
//	ComputeEnvironmentArray{ ComputeEnvironmentArgs{...} }
type ComputeEnvironmentArrayInput interface {
	pulumi.Input

	ToComputeEnvironmentArrayOutput() ComputeEnvironmentArrayOutput
	ToComputeEnvironmentArrayOutputWithContext(context.Context) ComputeEnvironmentArrayOutput
}

type ComputeEnvironmentArray []ComputeEnvironmentInput

func (ComputeEnvironmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ComputeEnvironment)(nil)).Elem()
}

func (i ComputeEnvironmentArray) ToComputeEnvironmentArrayOutput() ComputeEnvironmentArrayOutput {
	return i.ToComputeEnvironmentArrayOutputWithContext(context.Background())
}

func (i ComputeEnvironmentArray) ToComputeEnvironmentArrayOutputWithContext(ctx context.Context) ComputeEnvironmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ComputeEnvironmentArrayOutput)
}

// ComputeEnvironmentMapInput is an input type that accepts ComputeEnvironmentMap and ComputeEnvironmentMapOutput values.
// You can construct a concrete instance of `ComputeEnvironmentMapInput` via:
//
//	ComputeEnvironmentMap{ "key": ComputeEnvironmentArgs{...} }
type ComputeEnvironmentMapInput interface {
	pulumi.Input

	ToComputeEnvironmentMapOutput() ComputeEnvironmentMapOutput
	ToComputeEnvironmentMapOutputWithContext(context.Context) ComputeEnvironmentMapOutput
}

type ComputeEnvironmentMap map[string]ComputeEnvironmentInput

func (ComputeEnvironmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ComputeEnvironment)(nil)).Elem()
}

func (i ComputeEnvironmentMap) ToComputeEnvironmentMapOutput() ComputeEnvironmentMapOutput {
	return i.ToComputeEnvironmentMapOutputWithContext(context.Background())
}

func (i ComputeEnvironmentMap) ToComputeEnvironmentMapOutputWithContext(ctx context.Context) ComputeEnvironmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ComputeEnvironmentMapOutput)
}

type ComputeEnvironmentOutput struct{ *pulumi.OutputState }

func (ComputeEnvironmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ComputeEnvironment)(nil)).Elem()
}

func (o ComputeEnvironmentOutput) ToComputeEnvironmentOutput() ComputeEnvironmentOutput {
	return o
}

func (o ComputeEnvironmentOutput) ToComputeEnvironmentOutputWithContext(ctx context.Context) ComputeEnvironmentOutput {
	return o
}

// The Amazon Resource Name (ARN) of the compute environment.
func (o ComputeEnvironmentOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ComputeEnvironment) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed. If omitted, the provider will assign a random, unique name.
func (o ComputeEnvironmentOutput) ComputeEnvironmentName() pulumi.StringOutput {
	return o.ApplyT(func(v *ComputeEnvironment) pulumi.StringOutput { return v.ComputeEnvironmentName }).(pulumi.StringOutput)
}

// Creates a unique compute environment name beginning with the specified prefix. Conflicts with `computeEnvironmentName`.
func (o ComputeEnvironmentOutput) ComputeEnvironmentNamePrefix() pulumi.StringOutput {
	return o.ApplyT(func(v *ComputeEnvironment) pulumi.StringOutput { return v.ComputeEnvironmentNamePrefix }).(pulumi.StringOutput)
}

// Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
func (o ComputeEnvironmentOutput) ComputeResources() ComputeEnvironmentComputeResourcesPtrOutput {
	return o.ApplyT(func(v *ComputeEnvironment) ComputeEnvironmentComputeResourcesPtrOutput { return v.ComputeResources }).(ComputeEnvironmentComputeResourcesPtrOutput)
}

// The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
func (o ComputeEnvironmentOutput) EcsClusterArn() pulumi.StringOutput {
	return o.ApplyT(func(v *ComputeEnvironment) pulumi.StringOutput { return v.EcsClusterArn }).(pulumi.StringOutput)
}

// Details for the Amazon EKS cluster that supports the compute environment. See details below.
func (o ComputeEnvironmentOutput) EksConfiguration() ComputeEnvironmentEksConfigurationPtrOutput {
	return o.ApplyT(func(v *ComputeEnvironment) ComputeEnvironmentEksConfigurationPtrOutput { return v.EksConfiguration }).(ComputeEnvironmentEksConfigurationPtrOutput)
}

// The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
func (o ComputeEnvironmentOutput) ServiceRole() pulumi.StringOutput {
	return o.ApplyT(func(v *ComputeEnvironment) pulumi.StringOutput { return v.ServiceRole }).(pulumi.StringOutput)
}

// The state of the compute environment. If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. Valid items are `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
func (o ComputeEnvironmentOutput) State() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ComputeEnvironment) pulumi.StringPtrOutput { return v.State }).(pulumi.StringPtrOutput)
}

// The current status of the compute environment (for example, CREATING or VALID).
func (o ComputeEnvironmentOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *ComputeEnvironment) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// A short, human-readable string to provide additional details about the current status of the compute environment.
func (o ComputeEnvironmentOutput) StatusReason() pulumi.StringOutput {
	return o.ApplyT(func(v *ComputeEnvironment) pulumi.StringOutput { return v.StatusReason }).(pulumi.StringOutput)
}

// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ComputeEnvironmentOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ComputeEnvironment) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o ComputeEnvironmentOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ComputeEnvironment) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The type of the compute environment. Valid items are `MANAGED` or `UNMANAGED`.
func (o ComputeEnvironmentOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *ComputeEnvironment) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type ComputeEnvironmentArrayOutput struct{ *pulumi.OutputState }

func (ComputeEnvironmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ComputeEnvironment)(nil)).Elem()
}

func (o ComputeEnvironmentArrayOutput) ToComputeEnvironmentArrayOutput() ComputeEnvironmentArrayOutput {
	return o
}

func (o ComputeEnvironmentArrayOutput) ToComputeEnvironmentArrayOutputWithContext(ctx context.Context) ComputeEnvironmentArrayOutput {
	return o
}

func (o ComputeEnvironmentArrayOutput) Index(i pulumi.IntInput) ComputeEnvironmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ComputeEnvironment {
		return vs[0].([]*ComputeEnvironment)[vs[1].(int)]
	}).(ComputeEnvironmentOutput)
}

type ComputeEnvironmentMapOutput struct{ *pulumi.OutputState }

func (ComputeEnvironmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ComputeEnvironment)(nil)).Elem()
}

func (o ComputeEnvironmentMapOutput) ToComputeEnvironmentMapOutput() ComputeEnvironmentMapOutput {
	return o
}

func (o ComputeEnvironmentMapOutput) ToComputeEnvironmentMapOutputWithContext(ctx context.Context) ComputeEnvironmentMapOutput {
	return o
}

func (o ComputeEnvironmentMapOutput) MapIndex(k pulumi.StringInput) ComputeEnvironmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ComputeEnvironment {
		return vs[0].(map[string]*ComputeEnvironment)[vs[1].(string)]
	}).(ComputeEnvironmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ComputeEnvironmentInput)(nil)).Elem(), &ComputeEnvironment{})
	pulumi.RegisterInputType(reflect.TypeOf((*ComputeEnvironmentArrayInput)(nil)).Elem(), ComputeEnvironmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ComputeEnvironmentMapInput)(nil)).Elem(), ComputeEnvironmentMap{})
	pulumi.RegisterOutputType(ComputeEnvironmentOutput{})
	pulumi.RegisterOutputType(ComputeEnvironmentArrayOutput{})
	pulumi.RegisterOutputType(ComputeEnvironmentMapOutput{})
}
