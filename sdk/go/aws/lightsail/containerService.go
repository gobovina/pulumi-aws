// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package lightsail

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// An Amazon Lightsail container service is a highly scalable compute and networking resource on which you can deploy, run,
// and manage containers. For more information, see
// [Container services in Amazon Lightsail](https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-container-services).
//
// > **Note:** For more information about the AWS Regions in which you can create Amazon Lightsail container services,
// see ["Regions and Availability Zones in Amazon Lightsail"](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail).
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/lightsail"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := lightsail.NewContainerService(ctx, "myContainerService", &lightsail.ContainerServiceArgs{
//				IsDisabled: pulumi.Bool(false),
//				Power:      pulumi.String("nano"),
//				Scale:      pulumi.Int(1),
//				Tags: pulumi.StringMap{
//					"foo1": pulumi.String("bar1"),
//					"foo2": pulumi.String(""),
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
// ### Public Domain Names
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/lightsail"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := lightsail.NewContainerService(ctx, "myContainerService", &lightsail.ContainerServiceArgs{
//				PublicDomainNames: &lightsail.ContainerServicePublicDomainNamesArgs{
//					Certificates: lightsail.ContainerServicePublicDomainNamesCertificateArray{
//						&lightsail.ContainerServicePublicDomainNamesCertificateArgs{
//							CertificateName: pulumi.String("example-certificate"),
//							DomainNames: pulumi.StringArray{
//								pulumi.String("www.example.com"),
//							},
//						},
//					},
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
// ### Private Registry Access
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ecr"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/lightsail"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// defaultContainerService, err := lightsail.NewContainerService(ctx, "defaultContainerService", &lightsail.ContainerServiceArgs{
// PrivateRegistryAccess: &lightsail.ContainerServicePrivateRegistryAccessArgs{
// EcrImagePullerRole: &lightsail.ContainerServicePrivateRegistryAccessEcrImagePullerRoleArgs{
// IsActive: pulumi.Bool(true),
// },
// },
// })
// if err != nil {
// return err
// }
// defaultPolicyDocument := defaultContainerService.PrivateRegistryAccess.ApplyT(func(privateRegistryAccess lightsail.ContainerServicePrivateRegistryAccess) (iam.GetPolicyDocumentResult, error) {
// return iam.GetPolicyDocumentOutput(ctx, iam.GetPolicyDocumentOutputArgs{
// Statements: []iam.GetPolicyDocumentStatement{
// {
// Effect: "Allow",
// Principals: []iam.GetPolicyDocumentStatementPrincipal{
// {
// Type: "AWS",
// Identifiers: interface{}{
// privateRegistryAccess.EcrImagePullerRole.PrincipalArn,
// },
// },
// },
// Actions: []string{
// "ecr:BatchGetImage",
// "ecr:GetDownloadUrlForLayer",
// },
// },
// },
// }, nil), nil
// }).(iam.GetPolicyDocumentResultOutput)
// _, err = ecr.NewRepositoryPolicy(ctx, "defaultRepositoryPolicy", &ecr.RepositoryPolicyArgs{
// Repository: pulumi.Any(aws_ecr_repository.Default.Name),
// Policy: defaultPolicyDocument.ApplyT(func(defaultPolicyDocument iam.GetPolicyDocumentResult) (*string, error) {
// return &defaultPolicyDocument.Json, nil
// }).(pulumi.StringPtrOutput),
// })
// if err != nil {
// return err
// }
// return nil
// })
// }
// ```
//
// ## Import
//
// Using `pulumi import`, import Lightsail Container Service using the `name`. For example:
//
// ```sh
//
//	$ pulumi import aws:lightsail/containerService:ContainerService my_container_service container-service-1
//
// ```
type ContainerService struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) of the container service.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The Availability Zone. Follows the format us-east-2a (case-sensitive).
	AvailabilityZone pulumi.StringOutput `pulumi:"availabilityZone"`
	CreatedAt        pulumi.StringOutput `pulumi:"createdAt"`
	// A Boolean value indicating whether the container service is disabled. Defaults to `false`.
	IsDisabled pulumi.BoolPtrOutput `pulumi:"isDisabled"`
	// The name for the container service. Names must be of length 1 to 63, and be
	// unique within each AWS Region in your Lightsail account.
	Name pulumi.StringOutput `pulumi:"name"`
	// The power specification for the container service. The power specifies the amount of memory,
	// the number of vCPUs, and the monthly price of each node of the container service.
	// Possible values: `nano`, `micro`, `small`, `medium`, `large`, `xlarge`.
	Power pulumi.StringOutput `pulumi:"power"`
	// The ID of the power of the container service.
	PowerId pulumi.StringOutput `pulumi:"powerId"`
	// The principal ARN of the container service. The principal ARN can be used to create a trust
	// relationship between your standard AWS account and your Lightsail container service. This allows you to give your
	// service permission to access resources in your standard AWS account.
	PrincipalArn pulumi.StringOutput `pulumi:"principalArn"`
	// The private domain name of the container service. The private domain name is accessible only
	// by other resources within the default virtual private cloud (VPC) of your Lightsail account.
	PrivateDomainName pulumi.StringOutput `pulumi:"privateDomainName"`
	// An object to describe the configuration for the container service to access private container image repositories, such as Amazon Elastic Container Registry (Amazon ECR) private repositories. See Private Registry Access below for more details.
	PrivateRegistryAccess ContainerServicePrivateRegistryAccessOutput `pulumi:"privateRegistryAccess"`
	// The public domain names to use with the container service, such as example.com
	// and www.example.com. You can specify up to four public domain names for a container service. The domain names that you
	// specify are used when you create a deployment with a container configured as the public endpoint of your container
	// service. If you don't specify public domain names, then you can use the default domain of the container service.
	// Defined below.
	PublicDomainNames ContainerServicePublicDomainNamesPtrOutput `pulumi:"publicDomainNames"`
	// The Lightsail resource type of the container service (i.e., ContainerService).
	ResourceType pulumi.StringOutput `pulumi:"resourceType"`
	// The scale specification for the container service. The scale specifies the allocated compute
	// nodes of the container service.
	Scale pulumi.IntOutput `pulumi:"scale"`
	// The current state of the container service.
	State pulumi.StringOutput `pulumi:"state"`
	// Map of container service tags. To tag at launch, specify the tags in the Launch Template. If
	// configured with a provider
	// `defaultTags` configuration block
	// present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider
	// `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The publicly accessible URL of the container service. If no public endpoint is specified in the
	// currentDeployment, this URL returns a 404 response.
	Url pulumi.StringOutput `pulumi:"url"`
}

// NewContainerService registers a new resource with the given unique name, arguments, and options.
func NewContainerService(ctx *pulumi.Context,
	name string, args *ContainerServiceArgs, opts ...pulumi.ResourceOption) (*ContainerService, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Power == nil {
		return nil, errors.New("invalid value for required argument 'Power'")
	}
	if args.Scale == nil {
		return nil, errors.New("invalid value for required argument 'Scale'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ContainerService
	err := ctx.RegisterResource("aws:lightsail/containerService:ContainerService", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetContainerService gets an existing ContainerService resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetContainerService(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ContainerServiceState, opts ...pulumi.ResourceOption) (*ContainerService, error) {
	var resource ContainerService
	err := ctx.ReadResource("aws:lightsail/containerService:ContainerService", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ContainerService resources.
type containerServiceState struct {
	// The Amazon Resource Name (ARN) of the container service.
	Arn *string `pulumi:"arn"`
	// The Availability Zone. Follows the format us-east-2a (case-sensitive).
	AvailabilityZone *string `pulumi:"availabilityZone"`
	CreatedAt        *string `pulumi:"createdAt"`
	// A Boolean value indicating whether the container service is disabled. Defaults to `false`.
	IsDisabled *bool `pulumi:"isDisabled"`
	// The name for the container service. Names must be of length 1 to 63, and be
	// unique within each AWS Region in your Lightsail account.
	Name *string `pulumi:"name"`
	// The power specification for the container service. The power specifies the amount of memory,
	// the number of vCPUs, and the monthly price of each node of the container service.
	// Possible values: `nano`, `micro`, `small`, `medium`, `large`, `xlarge`.
	Power *string `pulumi:"power"`
	// The ID of the power of the container service.
	PowerId *string `pulumi:"powerId"`
	// The principal ARN of the container service. The principal ARN can be used to create a trust
	// relationship between your standard AWS account and your Lightsail container service. This allows you to give your
	// service permission to access resources in your standard AWS account.
	PrincipalArn *string `pulumi:"principalArn"`
	// The private domain name of the container service. The private domain name is accessible only
	// by other resources within the default virtual private cloud (VPC) of your Lightsail account.
	PrivateDomainName *string `pulumi:"privateDomainName"`
	// An object to describe the configuration for the container service to access private container image repositories, such as Amazon Elastic Container Registry (Amazon ECR) private repositories. See Private Registry Access below for more details.
	PrivateRegistryAccess *ContainerServicePrivateRegistryAccess `pulumi:"privateRegistryAccess"`
	// The public domain names to use with the container service, such as example.com
	// and www.example.com. You can specify up to four public domain names for a container service. The domain names that you
	// specify are used when you create a deployment with a container configured as the public endpoint of your container
	// service. If you don't specify public domain names, then you can use the default domain of the container service.
	// Defined below.
	PublicDomainNames *ContainerServicePublicDomainNames `pulumi:"publicDomainNames"`
	// The Lightsail resource type of the container service (i.e., ContainerService).
	ResourceType *string `pulumi:"resourceType"`
	// The scale specification for the container service. The scale specifies the allocated compute
	// nodes of the container service.
	Scale *int `pulumi:"scale"`
	// The current state of the container service.
	State *string `pulumi:"state"`
	// Map of container service tags. To tag at launch, specify the tags in the Launch Template. If
	// configured with a provider
	// `defaultTags` configuration block
	// present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider
	// `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The publicly accessible URL of the container service. If no public endpoint is specified in the
	// currentDeployment, this URL returns a 404 response.
	Url *string `pulumi:"url"`
}

type ContainerServiceState struct {
	// The Amazon Resource Name (ARN) of the container service.
	Arn pulumi.StringPtrInput
	// The Availability Zone. Follows the format us-east-2a (case-sensitive).
	AvailabilityZone pulumi.StringPtrInput
	CreatedAt        pulumi.StringPtrInput
	// A Boolean value indicating whether the container service is disabled. Defaults to `false`.
	IsDisabled pulumi.BoolPtrInput
	// The name for the container service. Names must be of length 1 to 63, and be
	// unique within each AWS Region in your Lightsail account.
	Name pulumi.StringPtrInput
	// The power specification for the container service. The power specifies the amount of memory,
	// the number of vCPUs, and the monthly price of each node of the container service.
	// Possible values: `nano`, `micro`, `small`, `medium`, `large`, `xlarge`.
	Power pulumi.StringPtrInput
	// The ID of the power of the container service.
	PowerId pulumi.StringPtrInput
	// The principal ARN of the container service. The principal ARN can be used to create a trust
	// relationship between your standard AWS account and your Lightsail container service. This allows you to give your
	// service permission to access resources in your standard AWS account.
	PrincipalArn pulumi.StringPtrInput
	// The private domain name of the container service. The private domain name is accessible only
	// by other resources within the default virtual private cloud (VPC) of your Lightsail account.
	PrivateDomainName pulumi.StringPtrInput
	// An object to describe the configuration for the container service to access private container image repositories, such as Amazon Elastic Container Registry (Amazon ECR) private repositories. See Private Registry Access below for more details.
	PrivateRegistryAccess ContainerServicePrivateRegistryAccessPtrInput
	// The public domain names to use with the container service, such as example.com
	// and www.example.com. You can specify up to four public domain names for a container service. The domain names that you
	// specify are used when you create a deployment with a container configured as the public endpoint of your container
	// service. If you don't specify public domain names, then you can use the default domain of the container service.
	// Defined below.
	PublicDomainNames ContainerServicePublicDomainNamesPtrInput
	// The Lightsail resource type of the container service (i.e., ContainerService).
	ResourceType pulumi.StringPtrInput
	// The scale specification for the container service. The scale specifies the allocated compute
	// nodes of the container service.
	Scale pulumi.IntPtrInput
	// The current state of the container service.
	State pulumi.StringPtrInput
	// Map of container service tags. To tag at launch, specify the tags in the Launch Template. If
	// configured with a provider
	// `defaultTags` configuration block
	// present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider
	// `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
	// The publicly accessible URL of the container service. If no public endpoint is specified in the
	// currentDeployment, this URL returns a 404 response.
	Url pulumi.StringPtrInput
}

func (ContainerServiceState) ElementType() reflect.Type {
	return reflect.TypeOf((*containerServiceState)(nil)).Elem()
}

type containerServiceArgs struct {
	// A Boolean value indicating whether the container service is disabled. Defaults to `false`.
	IsDisabled *bool `pulumi:"isDisabled"`
	// The name for the container service. Names must be of length 1 to 63, and be
	// unique within each AWS Region in your Lightsail account.
	Name *string `pulumi:"name"`
	// The power specification for the container service. The power specifies the amount of memory,
	// the number of vCPUs, and the monthly price of each node of the container service.
	// Possible values: `nano`, `micro`, `small`, `medium`, `large`, `xlarge`.
	Power string `pulumi:"power"`
	// An object to describe the configuration for the container service to access private container image repositories, such as Amazon Elastic Container Registry (Amazon ECR) private repositories. See Private Registry Access below for more details.
	PrivateRegistryAccess *ContainerServicePrivateRegistryAccess `pulumi:"privateRegistryAccess"`
	// The public domain names to use with the container service, such as example.com
	// and www.example.com. You can specify up to four public domain names for a container service. The domain names that you
	// specify are used when you create a deployment with a container configured as the public endpoint of your container
	// service. If you don't specify public domain names, then you can use the default domain of the container service.
	// Defined below.
	PublicDomainNames *ContainerServicePublicDomainNames `pulumi:"publicDomainNames"`
	// The scale specification for the container service. The scale specifies the allocated compute
	// nodes of the container service.
	Scale int `pulumi:"scale"`
	// Map of container service tags. To tag at launch, specify the tags in the Launch Template. If
	// configured with a provider
	// `defaultTags` configuration block
	// present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a ContainerService resource.
type ContainerServiceArgs struct {
	// A Boolean value indicating whether the container service is disabled. Defaults to `false`.
	IsDisabled pulumi.BoolPtrInput
	// The name for the container service. Names must be of length 1 to 63, and be
	// unique within each AWS Region in your Lightsail account.
	Name pulumi.StringPtrInput
	// The power specification for the container service. The power specifies the amount of memory,
	// the number of vCPUs, and the monthly price of each node of the container service.
	// Possible values: `nano`, `micro`, `small`, `medium`, `large`, `xlarge`.
	Power pulumi.StringInput
	// An object to describe the configuration for the container service to access private container image repositories, such as Amazon Elastic Container Registry (Amazon ECR) private repositories. See Private Registry Access below for more details.
	PrivateRegistryAccess ContainerServicePrivateRegistryAccessPtrInput
	// The public domain names to use with the container service, such as example.com
	// and www.example.com. You can specify up to four public domain names for a container service. The domain names that you
	// specify are used when you create a deployment with a container configured as the public endpoint of your container
	// service. If you don't specify public domain names, then you can use the default domain of the container service.
	// Defined below.
	PublicDomainNames ContainerServicePublicDomainNamesPtrInput
	// The scale specification for the container service. The scale specifies the allocated compute
	// nodes of the container service.
	Scale pulumi.IntInput
	// Map of container service tags. To tag at launch, specify the tags in the Launch Template. If
	// configured with a provider
	// `defaultTags` configuration block
	// present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (ContainerServiceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*containerServiceArgs)(nil)).Elem()
}

type ContainerServiceInput interface {
	pulumi.Input

	ToContainerServiceOutput() ContainerServiceOutput
	ToContainerServiceOutputWithContext(ctx context.Context) ContainerServiceOutput
}

func (*ContainerService) ElementType() reflect.Type {
	return reflect.TypeOf((**ContainerService)(nil)).Elem()
}

func (i *ContainerService) ToContainerServiceOutput() ContainerServiceOutput {
	return i.ToContainerServiceOutputWithContext(context.Background())
}

func (i *ContainerService) ToContainerServiceOutputWithContext(ctx context.Context) ContainerServiceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContainerServiceOutput)
}

// ContainerServiceArrayInput is an input type that accepts ContainerServiceArray and ContainerServiceArrayOutput values.
// You can construct a concrete instance of `ContainerServiceArrayInput` via:
//
//	ContainerServiceArray{ ContainerServiceArgs{...} }
type ContainerServiceArrayInput interface {
	pulumi.Input

	ToContainerServiceArrayOutput() ContainerServiceArrayOutput
	ToContainerServiceArrayOutputWithContext(context.Context) ContainerServiceArrayOutput
}

type ContainerServiceArray []ContainerServiceInput

func (ContainerServiceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ContainerService)(nil)).Elem()
}

func (i ContainerServiceArray) ToContainerServiceArrayOutput() ContainerServiceArrayOutput {
	return i.ToContainerServiceArrayOutputWithContext(context.Background())
}

func (i ContainerServiceArray) ToContainerServiceArrayOutputWithContext(ctx context.Context) ContainerServiceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContainerServiceArrayOutput)
}

// ContainerServiceMapInput is an input type that accepts ContainerServiceMap and ContainerServiceMapOutput values.
// You can construct a concrete instance of `ContainerServiceMapInput` via:
//
//	ContainerServiceMap{ "key": ContainerServiceArgs{...} }
type ContainerServiceMapInput interface {
	pulumi.Input

	ToContainerServiceMapOutput() ContainerServiceMapOutput
	ToContainerServiceMapOutputWithContext(context.Context) ContainerServiceMapOutput
}

type ContainerServiceMap map[string]ContainerServiceInput

func (ContainerServiceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ContainerService)(nil)).Elem()
}

func (i ContainerServiceMap) ToContainerServiceMapOutput() ContainerServiceMapOutput {
	return i.ToContainerServiceMapOutputWithContext(context.Background())
}

func (i ContainerServiceMap) ToContainerServiceMapOutputWithContext(ctx context.Context) ContainerServiceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContainerServiceMapOutput)
}

type ContainerServiceOutput struct{ *pulumi.OutputState }

func (ContainerServiceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ContainerService)(nil)).Elem()
}

func (o ContainerServiceOutput) ToContainerServiceOutput() ContainerServiceOutput {
	return o
}

func (o ContainerServiceOutput) ToContainerServiceOutputWithContext(ctx context.Context) ContainerServiceOutput {
	return o
}

// The Amazon Resource Name (ARN) of the container service.
func (o ContainerServiceOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerService) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The Availability Zone. Follows the format us-east-2a (case-sensitive).
func (o ContainerServiceOutput) AvailabilityZone() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerService) pulumi.StringOutput { return v.AvailabilityZone }).(pulumi.StringOutput)
}

func (o ContainerServiceOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerService) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// A Boolean value indicating whether the container service is disabled. Defaults to `false`.
func (o ContainerServiceOutput) IsDisabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ContainerService) pulumi.BoolPtrOutput { return v.IsDisabled }).(pulumi.BoolPtrOutput)
}

// The name for the container service. Names must be of length 1 to 63, and be
// unique within each AWS Region in your Lightsail account.
func (o ContainerServiceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerService) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The power specification for the container service. The power specifies the amount of memory,
// the number of vCPUs, and the monthly price of each node of the container service.
// Possible values: `nano`, `micro`, `small`, `medium`, `large`, `xlarge`.
func (o ContainerServiceOutput) Power() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerService) pulumi.StringOutput { return v.Power }).(pulumi.StringOutput)
}

// The ID of the power of the container service.
func (o ContainerServiceOutput) PowerId() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerService) pulumi.StringOutput { return v.PowerId }).(pulumi.StringOutput)
}

// The principal ARN of the container service. The principal ARN can be used to create a trust
// relationship between your standard AWS account and your Lightsail container service. This allows you to give your
// service permission to access resources in your standard AWS account.
func (o ContainerServiceOutput) PrincipalArn() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerService) pulumi.StringOutput { return v.PrincipalArn }).(pulumi.StringOutput)
}

// The private domain name of the container service. The private domain name is accessible only
// by other resources within the default virtual private cloud (VPC) of your Lightsail account.
func (o ContainerServiceOutput) PrivateDomainName() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerService) pulumi.StringOutput { return v.PrivateDomainName }).(pulumi.StringOutput)
}

// An object to describe the configuration for the container service to access private container image repositories, such as Amazon Elastic Container Registry (Amazon ECR) private repositories. See Private Registry Access below for more details.
func (o ContainerServiceOutput) PrivateRegistryAccess() ContainerServicePrivateRegistryAccessOutput {
	return o.ApplyT(func(v *ContainerService) ContainerServicePrivateRegistryAccessOutput { return v.PrivateRegistryAccess }).(ContainerServicePrivateRegistryAccessOutput)
}

// The public domain names to use with the container service, such as example.com
// and www.example.com. You can specify up to four public domain names for a container service. The domain names that you
// specify are used when you create a deployment with a container configured as the public endpoint of your container
// service. If you don't specify public domain names, then you can use the default domain of the container service.
// Defined below.
func (o ContainerServiceOutput) PublicDomainNames() ContainerServicePublicDomainNamesPtrOutput {
	return o.ApplyT(func(v *ContainerService) ContainerServicePublicDomainNamesPtrOutput { return v.PublicDomainNames }).(ContainerServicePublicDomainNamesPtrOutput)
}

// The Lightsail resource type of the container service (i.e., ContainerService).
func (o ContainerServiceOutput) ResourceType() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerService) pulumi.StringOutput { return v.ResourceType }).(pulumi.StringOutput)
}

// The scale specification for the container service. The scale specifies the allocated compute
// nodes of the container service.
func (o ContainerServiceOutput) Scale() pulumi.IntOutput {
	return o.ApplyT(func(v *ContainerService) pulumi.IntOutput { return v.Scale }).(pulumi.IntOutput)
}

// The current state of the container service.
func (o ContainerServiceOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerService) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// Map of container service tags. To tag at launch, specify the tags in the Launch Template. If
// configured with a provider
// `defaultTags` configuration block
// present, tags with matching keys will overwrite those defined at the provider-level.
func (o ContainerServiceOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ContainerService) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider
// `defaultTags` configuration block.
func (o ContainerServiceOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ContainerService) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The publicly accessible URL of the container service. If no public endpoint is specified in the
// currentDeployment, this URL returns a 404 response.
func (o ContainerServiceOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerService) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

type ContainerServiceArrayOutput struct{ *pulumi.OutputState }

func (ContainerServiceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ContainerService)(nil)).Elem()
}

func (o ContainerServiceArrayOutput) ToContainerServiceArrayOutput() ContainerServiceArrayOutput {
	return o
}

func (o ContainerServiceArrayOutput) ToContainerServiceArrayOutputWithContext(ctx context.Context) ContainerServiceArrayOutput {
	return o
}

func (o ContainerServiceArrayOutput) Index(i pulumi.IntInput) ContainerServiceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ContainerService {
		return vs[0].([]*ContainerService)[vs[1].(int)]
	}).(ContainerServiceOutput)
}

type ContainerServiceMapOutput struct{ *pulumi.OutputState }

func (ContainerServiceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ContainerService)(nil)).Elem()
}

func (o ContainerServiceMapOutput) ToContainerServiceMapOutput() ContainerServiceMapOutput {
	return o
}

func (o ContainerServiceMapOutput) ToContainerServiceMapOutputWithContext(ctx context.Context) ContainerServiceMapOutput {
	return o
}

func (o ContainerServiceMapOutput) MapIndex(k pulumi.StringInput) ContainerServiceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ContainerService {
		return vs[0].(map[string]*ContainerService)[vs[1].(string)]
	}).(ContainerServiceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ContainerServiceInput)(nil)).Elem(), &ContainerService{})
	pulumi.RegisterInputType(reflect.TypeOf((*ContainerServiceArrayInput)(nil)).Elem(), ContainerServiceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ContainerServiceMapInput)(nil)).Elem(), ContainerServiceMap{})
	pulumi.RegisterOutputType(ContainerServiceOutput{})
	pulumi.RegisterOutputType(ContainerServiceArrayOutput{})
	pulumi.RegisterOutputType(ContainerServiceMapOutput{})
}
