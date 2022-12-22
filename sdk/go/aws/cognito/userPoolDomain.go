// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cognito

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cognito User Pool Domain resource.
//
// ## Example Usage
// ### Amazon Cognito domain
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/cognito"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := cognito.NewUserPool(ctx, "example", nil)
//			if err != nil {
//				return err
//			}
//			_, err = cognito.NewUserPoolDomain(ctx, "main", &cognito.UserPoolDomainArgs{
//				Domain:     pulumi.String("example-domain"),
//				UserPoolId: example.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Custom Cognito domain
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/cognito"
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/route53"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleUserPool, err := cognito.NewUserPool(ctx, "exampleUserPool", nil)
//			if err != nil {
//				return err
//			}
//			main, err := cognito.NewUserPoolDomain(ctx, "main", &cognito.UserPoolDomainArgs{
//				Domain:         pulumi.String("example-domain"),
//				CertificateArn: pulumi.Any(aws_acm_certificate.Cert.Arn),
//				UserPoolId:     exampleUserPool.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			exampleZone, err := route53.LookupZone(ctx, &route53.LookupZoneArgs{
//				Name: pulumi.StringRef("example.com"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = route53.NewRecord(ctx, "auth-cognito-A", &route53.RecordArgs{
//				Name:   main.Domain,
//				Type:   pulumi.String("A"),
//				ZoneId: *pulumi.String(exampleZone.ZoneId),
//				Aliases: route53.RecordAliasArray{
//					&route53.RecordAliasArgs{
//						EvaluateTargetHealth: pulumi.Bool(false),
//						Name:                 main.CloudfrontDistributionArn,
//						ZoneId:               pulumi.String("Z2FDTNDATAQYW2"),
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
//
// ## Import
//
// Cognito User Pool Domains can be imported using the `domain`, e.g.,
//
// ```sh
//
//	$ pulumi import aws:cognito/userPoolDomain:UserPoolDomain main auth.example.org
//
// ```
type UserPoolDomain struct {
	pulumi.CustomResourceState

	// The AWS account ID for the user pool owner.
	AwsAccountId pulumi.StringOutput `pulumi:"awsAccountId"`
	// The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
	CertificateArn pulumi.StringPtrOutput `pulumi:"certificateArn"`
	// The URL of the CloudFront distribution. This is required to generate the ALIAS `route53.Record`
	CloudfrontDistributionArn pulumi.StringOutput `pulumi:"cloudfrontDistributionArn"`
	// For custom domains, this is the fully-qualified domain name, such as auth.example.com. For Amazon Cognito prefix domains, this is the prefix alone, such as auth.
	Domain pulumi.StringOutput `pulumi:"domain"`
	// The S3 bucket where the static files for this domain are stored.
	S3Bucket pulumi.StringOutput `pulumi:"s3Bucket"`
	// The user pool ID.
	UserPoolId pulumi.StringOutput `pulumi:"userPoolId"`
	// The app version.
	Version pulumi.StringOutput `pulumi:"version"`
}

// NewUserPoolDomain registers a new resource with the given unique name, arguments, and options.
func NewUserPoolDomain(ctx *pulumi.Context,
	name string, args *UserPoolDomainArgs, opts ...pulumi.ResourceOption) (*UserPoolDomain, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Domain == nil {
		return nil, errors.New("invalid value for required argument 'Domain'")
	}
	if args.UserPoolId == nil {
		return nil, errors.New("invalid value for required argument 'UserPoolId'")
	}
	var resource UserPoolDomain
	err := ctx.RegisterResource("aws:cognito/userPoolDomain:UserPoolDomain", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserPoolDomain gets an existing UserPoolDomain resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserPoolDomain(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserPoolDomainState, opts ...pulumi.ResourceOption) (*UserPoolDomain, error) {
	var resource UserPoolDomain
	err := ctx.ReadResource("aws:cognito/userPoolDomain:UserPoolDomain", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserPoolDomain resources.
type userPoolDomainState struct {
	// The AWS account ID for the user pool owner.
	AwsAccountId *string `pulumi:"awsAccountId"`
	// The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
	CertificateArn *string `pulumi:"certificateArn"`
	// The URL of the CloudFront distribution. This is required to generate the ALIAS `route53.Record`
	CloudfrontDistributionArn *string `pulumi:"cloudfrontDistributionArn"`
	// For custom domains, this is the fully-qualified domain name, such as auth.example.com. For Amazon Cognito prefix domains, this is the prefix alone, such as auth.
	Domain *string `pulumi:"domain"`
	// The S3 bucket where the static files for this domain are stored.
	S3Bucket *string `pulumi:"s3Bucket"`
	// The user pool ID.
	UserPoolId *string `pulumi:"userPoolId"`
	// The app version.
	Version *string `pulumi:"version"`
}

type UserPoolDomainState struct {
	// The AWS account ID for the user pool owner.
	AwsAccountId pulumi.StringPtrInput
	// The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
	CertificateArn pulumi.StringPtrInput
	// The URL of the CloudFront distribution. This is required to generate the ALIAS `route53.Record`
	CloudfrontDistributionArn pulumi.StringPtrInput
	// For custom domains, this is the fully-qualified domain name, such as auth.example.com. For Amazon Cognito prefix domains, this is the prefix alone, such as auth.
	Domain pulumi.StringPtrInput
	// The S3 bucket where the static files for this domain are stored.
	S3Bucket pulumi.StringPtrInput
	// The user pool ID.
	UserPoolId pulumi.StringPtrInput
	// The app version.
	Version pulumi.StringPtrInput
}

func (UserPoolDomainState) ElementType() reflect.Type {
	return reflect.TypeOf((*userPoolDomainState)(nil)).Elem()
}

type userPoolDomainArgs struct {
	// The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
	CertificateArn *string `pulumi:"certificateArn"`
	// For custom domains, this is the fully-qualified domain name, such as auth.example.com. For Amazon Cognito prefix domains, this is the prefix alone, such as auth.
	Domain string `pulumi:"domain"`
	// The user pool ID.
	UserPoolId string `pulumi:"userPoolId"`
}

// The set of arguments for constructing a UserPoolDomain resource.
type UserPoolDomainArgs struct {
	// The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
	CertificateArn pulumi.StringPtrInput
	// For custom domains, this is the fully-qualified domain name, such as auth.example.com. For Amazon Cognito prefix domains, this is the prefix alone, such as auth.
	Domain pulumi.StringInput
	// The user pool ID.
	UserPoolId pulumi.StringInput
}

func (UserPoolDomainArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userPoolDomainArgs)(nil)).Elem()
}

type UserPoolDomainInput interface {
	pulumi.Input

	ToUserPoolDomainOutput() UserPoolDomainOutput
	ToUserPoolDomainOutputWithContext(ctx context.Context) UserPoolDomainOutput
}

func (*UserPoolDomain) ElementType() reflect.Type {
	return reflect.TypeOf((**UserPoolDomain)(nil)).Elem()
}

func (i *UserPoolDomain) ToUserPoolDomainOutput() UserPoolDomainOutput {
	return i.ToUserPoolDomainOutputWithContext(context.Background())
}

func (i *UserPoolDomain) ToUserPoolDomainOutputWithContext(ctx context.Context) UserPoolDomainOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserPoolDomainOutput)
}

// UserPoolDomainArrayInput is an input type that accepts UserPoolDomainArray and UserPoolDomainArrayOutput values.
// You can construct a concrete instance of `UserPoolDomainArrayInput` via:
//
//	UserPoolDomainArray{ UserPoolDomainArgs{...} }
type UserPoolDomainArrayInput interface {
	pulumi.Input

	ToUserPoolDomainArrayOutput() UserPoolDomainArrayOutput
	ToUserPoolDomainArrayOutputWithContext(context.Context) UserPoolDomainArrayOutput
}

type UserPoolDomainArray []UserPoolDomainInput

func (UserPoolDomainArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserPoolDomain)(nil)).Elem()
}

func (i UserPoolDomainArray) ToUserPoolDomainArrayOutput() UserPoolDomainArrayOutput {
	return i.ToUserPoolDomainArrayOutputWithContext(context.Background())
}

func (i UserPoolDomainArray) ToUserPoolDomainArrayOutputWithContext(ctx context.Context) UserPoolDomainArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserPoolDomainArrayOutput)
}

// UserPoolDomainMapInput is an input type that accepts UserPoolDomainMap and UserPoolDomainMapOutput values.
// You can construct a concrete instance of `UserPoolDomainMapInput` via:
//
//	UserPoolDomainMap{ "key": UserPoolDomainArgs{...} }
type UserPoolDomainMapInput interface {
	pulumi.Input

	ToUserPoolDomainMapOutput() UserPoolDomainMapOutput
	ToUserPoolDomainMapOutputWithContext(context.Context) UserPoolDomainMapOutput
}

type UserPoolDomainMap map[string]UserPoolDomainInput

func (UserPoolDomainMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserPoolDomain)(nil)).Elem()
}

func (i UserPoolDomainMap) ToUserPoolDomainMapOutput() UserPoolDomainMapOutput {
	return i.ToUserPoolDomainMapOutputWithContext(context.Background())
}

func (i UserPoolDomainMap) ToUserPoolDomainMapOutputWithContext(ctx context.Context) UserPoolDomainMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserPoolDomainMapOutput)
}

type UserPoolDomainOutput struct{ *pulumi.OutputState }

func (UserPoolDomainOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserPoolDomain)(nil)).Elem()
}

func (o UserPoolDomainOutput) ToUserPoolDomainOutput() UserPoolDomainOutput {
	return o
}

func (o UserPoolDomainOutput) ToUserPoolDomainOutputWithContext(ctx context.Context) UserPoolDomainOutput {
	return o
}

// The AWS account ID for the user pool owner.
func (o UserPoolDomainOutput) AwsAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *UserPoolDomain) pulumi.StringOutput { return v.AwsAccountId }).(pulumi.StringOutput)
}

// The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
func (o UserPoolDomainOutput) CertificateArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *UserPoolDomain) pulumi.StringPtrOutput { return v.CertificateArn }).(pulumi.StringPtrOutput)
}

// The URL of the CloudFront distribution. This is required to generate the ALIAS `route53.Record`
func (o UserPoolDomainOutput) CloudfrontDistributionArn() pulumi.StringOutput {
	return o.ApplyT(func(v *UserPoolDomain) pulumi.StringOutput { return v.CloudfrontDistributionArn }).(pulumi.StringOutput)
}

// For custom domains, this is the fully-qualified domain name, such as auth.example.com. For Amazon Cognito prefix domains, this is the prefix alone, such as auth.
func (o UserPoolDomainOutput) Domain() pulumi.StringOutput {
	return o.ApplyT(func(v *UserPoolDomain) pulumi.StringOutput { return v.Domain }).(pulumi.StringOutput)
}

// The S3 bucket where the static files for this domain are stored.
func (o UserPoolDomainOutput) S3Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v *UserPoolDomain) pulumi.StringOutput { return v.S3Bucket }).(pulumi.StringOutput)
}

// The user pool ID.
func (o UserPoolDomainOutput) UserPoolId() pulumi.StringOutput {
	return o.ApplyT(func(v *UserPoolDomain) pulumi.StringOutput { return v.UserPoolId }).(pulumi.StringOutput)
}

// The app version.
func (o UserPoolDomainOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v *UserPoolDomain) pulumi.StringOutput { return v.Version }).(pulumi.StringOutput)
}

type UserPoolDomainArrayOutput struct{ *pulumi.OutputState }

func (UserPoolDomainArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserPoolDomain)(nil)).Elem()
}

func (o UserPoolDomainArrayOutput) ToUserPoolDomainArrayOutput() UserPoolDomainArrayOutput {
	return o
}

func (o UserPoolDomainArrayOutput) ToUserPoolDomainArrayOutputWithContext(ctx context.Context) UserPoolDomainArrayOutput {
	return o
}

func (o UserPoolDomainArrayOutput) Index(i pulumi.IntInput) UserPoolDomainOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UserPoolDomain {
		return vs[0].([]*UserPoolDomain)[vs[1].(int)]
	}).(UserPoolDomainOutput)
}

type UserPoolDomainMapOutput struct{ *pulumi.OutputState }

func (UserPoolDomainMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserPoolDomain)(nil)).Elem()
}

func (o UserPoolDomainMapOutput) ToUserPoolDomainMapOutput() UserPoolDomainMapOutput {
	return o
}

func (o UserPoolDomainMapOutput) ToUserPoolDomainMapOutputWithContext(ctx context.Context) UserPoolDomainMapOutput {
	return o
}

func (o UserPoolDomainMapOutput) MapIndex(k pulumi.StringInput) UserPoolDomainOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UserPoolDomain {
		return vs[0].(map[string]*UserPoolDomain)[vs[1].(string)]
	}).(UserPoolDomainOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserPoolDomainInput)(nil)).Elem(), &UserPoolDomain{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserPoolDomainArrayInput)(nil)).Elem(), UserPoolDomainArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserPoolDomainMapInput)(nil)).Elem(), UserPoolDomainMap{})
	pulumi.RegisterOutputType(UserPoolDomainOutput{})
	pulumi.RegisterOutputType(UserPoolDomainArrayOutput{})
	pulumi.RegisterOutputType(UserPoolDomainMapOutput{})
}
