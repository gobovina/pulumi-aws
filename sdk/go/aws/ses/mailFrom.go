// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ses

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an SES domain MAIL FROM resource.
//
// > **NOTE:** For the MAIL FROM domain to be fully usable, this resource should be paired with the ses.DomainIdentity resource. To validate the MAIL FROM domain, a DNS MX record is required. To pass SPF checks, a DNS TXT record may also be required. See the [Amazon SES MAIL FROM documentation](https://docs.aws.amazon.com/ses/latest/dg/mail-from.html) for more information.
//
// ## Example Usage
// ### Domain Identity MAIL FROM
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/route53"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ses"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// Example SES Domain Identity
//			exampleDomainIdentity, err := ses.NewDomainIdentity(ctx, "example", &ses.DomainIdentityArgs{
//				Domain: pulumi.String("example.com"),
//			})
//			if err != nil {
//				return err
//			}
//			example, err := ses.NewMailFrom(ctx, "example", &ses.MailFromArgs{
//				Domain: exampleDomainIdentity.Domain,
//				MailFromDomain: exampleDomainIdentity.Domain.ApplyT(func(domain string) (string, error) {
//					return fmt.Sprintf("bounce.%v", domain), nil
//				}).(pulumi.StringOutput),
//			})
//			if err != nil {
//				return err
//			}
//			// Example Route53 MX record
//			_, err = route53.NewRecord(ctx, "example_ses_domain_mail_from_mx", &route53.RecordArgs{
//				ZoneId: pulumi.Any(exampleAwsRoute53Zone.Id),
//				Name:   example.MailFromDomain,
//				Type:   pulumi.String("MX"),
//				Ttl:    pulumi.Int(600),
//				Records: pulumi.StringArray{
//					pulumi.String("10 feedback-smtp.us-east-1.amazonses.com"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			// Example Route53 TXT record for SPF
//			_, err = route53.NewRecord(ctx, "example_ses_domain_mail_from_txt", &route53.RecordArgs{
//				ZoneId: pulumi.Any(exampleAwsRoute53Zone.Id),
//				Name:   example.MailFromDomain,
//				Type:   pulumi.String("TXT"),
//				Ttl:    pulumi.Int(600),
//				Records: pulumi.StringArray{
//					pulumi.String("v=spf1 include:amazonses.com -all"),
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
// ### Email Identity MAIL FROM
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ses"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// Example SES Email Identity
//			example, err := ses.NewEmailIdentity(ctx, "example", &ses.EmailIdentityArgs{
//				Email: pulumi.String("user@example.com"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ses.NewMailFrom(ctx, "example", &ses.MailFromArgs{
//				Domain:         example.Email,
//				MailFromDomain: pulumi.String("mail.example.com"),
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
// Using `pulumi import`, import MAIL FROM domain using the `domain` attribute. For example:
//
// ```sh
//
//	$ pulumi import aws:ses/mailFrom:MailFrom example example.com
//
// ```
type MailFrom struct {
	pulumi.CustomResourceState

	// The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
	BehaviorOnMxFailure pulumi.StringPtrOutput `pulumi:"behaviorOnMxFailure"`
	// Verified domain name or email identity to generate DKIM tokens for.
	Domain pulumi.StringOutput `pulumi:"domain"`
	// Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
	//
	// The following arguments are optional:
	MailFromDomain pulumi.StringOutput `pulumi:"mailFromDomain"`
}

// NewMailFrom registers a new resource with the given unique name, arguments, and options.
func NewMailFrom(ctx *pulumi.Context,
	name string, args *MailFromArgs, opts ...pulumi.ResourceOption) (*MailFrom, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Domain == nil {
		return nil, errors.New("invalid value for required argument 'Domain'")
	}
	if args.MailFromDomain == nil {
		return nil, errors.New("invalid value for required argument 'MailFromDomain'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MailFrom
	err := ctx.RegisterResource("aws:ses/mailFrom:MailFrom", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMailFrom gets an existing MailFrom resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMailFrom(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MailFromState, opts ...pulumi.ResourceOption) (*MailFrom, error) {
	var resource MailFrom
	err := ctx.ReadResource("aws:ses/mailFrom:MailFrom", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MailFrom resources.
type mailFromState struct {
	// The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
	BehaviorOnMxFailure *string `pulumi:"behaviorOnMxFailure"`
	// Verified domain name or email identity to generate DKIM tokens for.
	Domain *string `pulumi:"domain"`
	// Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
	//
	// The following arguments are optional:
	MailFromDomain *string `pulumi:"mailFromDomain"`
}

type MailFromState struct {
	// The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
	BehaviorOnMxFailure pulumi.StringPtrInput
	// Verified domain name or email identity to generate DKIM tokens for.
	Domain pulumi.StringPtrInput
	// Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
	//
	// The following arguments are optional:
	MailFromDomain pulumi.StringPtrInput
}

func (MailFromState) ElementType() reflect.Type {
	return reflect.TypeOf((*mailFromState)(nil)).Elem()
}

type mailFromArgs struct {
	// The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
	BehaviorOnMxFailure *string `pulumi:"behaviorOnMxFailure"`
	// Verified domain name or email identity to generate DKIM tokens for.
	Domain string `pulumi:"domain"`
	// Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
	//
	// The following arguments are optional:
	MailFromDomain string `pulumi:"mailFromDomain"`
}

// The set of arguments for constructing a MailFrom resource.
type MailFromArgs struct {
	// The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
	BehaviorOnMxFailure pulumi.StringPtrInput
	// Verified domain name or email identity to generate DKIM tokens for.
	Domain pulumi.StringInput
	// Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
	//
	// The following arguments are optional:
	MailFromDomain pulumi.StringInput
}

func (MailFromArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*mailFromArgs)(nil)).Elem()
}

type MailFromInput interface {
	pulumi.Input

	ToMailFromOutput() MailFromOutput
	ToMailFromOutputWithContext(ctx context.Context) MailFromOutput
}

func (*MailFrom) ElementType() reflect.Type {
	return reflect.TypeOf((**MailFrom)(nil)).Elem()
}

func (i *MailFrom) ToMailFromOutput() MailFromOutput {
	return i.ToMailFromOutputWithContext(context.Background())
}

func (i *MailFrom) ToMailFromOutputWithContext(ctx context.Context) MailFromOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MailFromOutput)
}

// MailFromArrayInput is an input type that accepts MailFromArray and MailFromArrayOutput values.
// You can construct a concrete instance of `MailFromArrayInput` via:
//
//	MailFromArray{ MailFromArgs{...} }
type MailFromArrayInput interface {
	pulumi.Input

	ToMailFromArrayOutput() MailFromArrayOutput
	ToMailFromArrayOutputWithContext(context.Context) MailFromArrayOutput
}

type MailFromArray []MailFromInput

func (MailFromArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MailFrom)(nil)).Elem()
}

func (i MailFromArray) ToMailFromArrayOutput() MailFromArrayOutput {
	return i.ToMailFromArrayOutputWithContext(context.Background())
}

func (i MailFromArray) ToMailFromArrayOutputWithContext(ctx context.Context) MailFromArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MailFromArrayOutput)
}

// MailFromMapInput is an input type that accepts MailFromMap and MailFromMapOutput values.
// You can construct a concrete instance of `MailFromMapInput` via:
//
//	MailFromMap{ "key": MailFromArgs{...} }
type MailFromMapInput interface {
	pulumi.Input

	ToMailFromMapOutput() MailFromMapOutput
	ToMailFromMapOutputWithContext(context.Context) MailFromMapOutput
}

type MailFromMap map[string]MailFromInput

func (MailFromMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MailFrom)(nil)).Elem()
}

func (i MailFromMap) ToMailFromMapOutput() MailFromMapOutput {
	return i.ToMailFromMapOutputWithContext(context.Background())
}

func (i MailFromMap) ToMailFromMapOutputWithContext(ctx context.Context) MailFromMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MailFromMapOutput)
}

type MailFromOutput struct{ *pulumi.OutputState }

func (MailFromOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MailFrom)(nil)).Elem()
}

func (o MailFromOutput) ToMailFromOutput() MailFromOutput {
	return o
}

func (o MailFromOutput) ToMailFromOutputWithContext(ctx context.Context) MailFromOutput {
	return o
}

// The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
func (o MailFromOutput) BehaviorOnMxFailure() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MailFrom) pulumi.StringPtrOutput { return v.BehaviorOnMxFailure }).(pulumi.StringPtrOutput)
}

// Verified domain name or email identity to generate DKIM tokens for.
func (o MailFromOutput) Domain() pulumi.StringOutput {
	return o.ApplyT(func(v *MailFrom) pulumi.StringOutput { return v.Domain }).(pulumi.StringOutput)
}

// Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
//
// The following arguments are optional:
func (o MailFromOutput) MailFromDomain() pulumi.StringOutput {
	return o.ApplyT(func(v *MailFrom) pulumi.StringOutput { return v.MailFromDomain }).(pulumi.StringOutput)
}

type MailFromArrayOutput struct{ *pulumi.OutputState }

func (MailFromArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MailFrom)(nil)).Elem()
}

func (o MailFromArrayOutput) ToMailFromArrayOutput() MailFromArrayOutput {
	return o
}

func (o MailFromArrayOutput) ToMailFromArrayOutputWithContext(ctx context.Context) MailFromArrayOutput {
	return o
}

func (o MailFromArrayOutput) Index(i pulumi.IntInput) MailFromOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MailFrom {
		return vs[0].([]*MailFrom)[vs[1].(int)]
	}).(MailFromOutput)
}

type MailFromMapOutput struct{ *pulumi.OutputState }

func (MailFromMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MailFrom)(nil)).Elem()
}

func (o MailFromMapOutput) ToMailFromMapOutput() MailFromMapOutput {
	return o
}

func (o MailFromMapOutput) ToMailFromMapOutputWithContext(ctx context.Context) MailFromMapOutput {
	return o
}

func (o MailFromMapOutput) MapIndex(k pulumi.StringInput) MailFromOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MailFrom {
		return vs[0].(map[string]*MailFrom)[vs[1].(string)]
	}).(MailFromOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MailFromInput)(nil)).Elem(), &MailFrom{})
	pulumi.RegisterInputType(reflect.TypeOf((*MailFromArrayInput)(nil)).Elem(), MailFromArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MailFromMapInput)(nil)).Elem(), MailFromMap{})
	pulumi.RegisterOutputType(MailFromOutput{})
	pulumi.RegisterOutputType(MailFromArrayOutput{})
	pulumi.RegisterOutputType(MailFromMapOutput{})
}
