// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package route53domains

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to manage a domain that has been [registered](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html) and associated with the current AWS account.
//
// **This is an advanced resource** and has special caveats to be aware of when using it. Please read this document in its entirety before using this resource.
//
// The `route53domains.RegisteredDomain` resource behaves differently from normal resources in that if a domain has been registered, the provider does not _register_ this domain, but instead "adopts" it into management. A destroy does not delete the domain but does remove the resource from state.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/route53domains"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := route53domains.NewRegisteredDomain(ctx, "example", &route53domains.RegisteredDomainArgs{
//				DomainName: pulumi.String("example.com"),
//				NameServers: route53domains.RegisteredDomainNameServerArray{
//					&route53domains.RegisteredDomainNameServerArgs{
//						Name: pulumi.String("ns-195.awsdns-24.com"),
//					},
//					&route53domains.RegisteredDomainNameServerArgs{
//						Name: pulumi.String("ns-874.awsdns-45.net"),
//					},
//				},
//				Tags: pulumi.StringMap{
//					"Environment": pulumi.String("test"),
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
// Using `pulumi import`, import domains using the domain name. For example:
//
// ```sh
//
//	$ pulumi import aws:route53domains/registeredDomain:RegisteredDomain example example.com
//
// ```
type RegisteredDomain struct {
	pulumi.CustomResourceState

	// Email address to contact to report incorrect contact information for a domain, to report that the domain is being used to send spam, to report that someone is cybersquatting on a domain name, or report some other type of abuse.
	AbuseContactEmail pulumi.StringOutput `pulumi:"abuseContactEmail"`
	// Phone number for reporting abuse.
	AbuseContactPhone pulumi.StringOutput `pulumi:"abuseContactPhone"`
	// Details about the domain administrative contact. See Contact Blocks for more details.
	AdminContact RegisteredDomainAdminContactOutput `pulumi:"adminContact"`
	// Whether domain administrative contact information is concealed from WHOIS queries. Default: `true`.
	AdminPrivacy pulumi.BoolPtrOutput `pulumi:"adminPrivacy"`
	// Whether the domain registration is set to renew automatically. Default: `true`.
	AutoRenew pulumi.BoolPtrOutput `pulumi:"autoRenew"`
	// The date when the domain was created as found in the response to a WHOIS query.
	CreationDate pulumi.StringOutput `pulumi:"creationDate"`
	// The name of the registered domain.
	DomainName pulumi.StringOutput `pulumi:"domainName"`
	// The date when the registration for the domain is set to expire.
	ExpirationDate pulumi.StringOutput `pulumi:"expirationDate"`
	// The list of nameservers for the domain. See `nameServer` Blocks for more details.
	NameServers RegisteredDomainNameServerArrayOutput `pulumi:"nameServers"`
	// Details about the domain registrant. See Contact Blocks for more details.
	RegistrantContact RegisteredDomainRegistrantContactOutput `pulumi:"registrantContact"`
	// Whether domain registrant contact information is concealed from WHOIS queries. Default: `true`.
	RegistrantPrivacy pulumi.BoolPtrOutput `pulumi:"registrantPrivacy"`
	// Name of the registrar of the domain as identified in the registry.
	RegistrarName pulumi.StringOutput `pulumi:"registrarName"`
	// Web address of the registrar.
	RegistrarUrl pulumi.StringOutput `pulumi:"registrarUrl"`
	// Reseller of the domain.
	Reseller pulumi.StringOutput `pulumi:"reseller"`
	// List of [domain name status codes](https://www.icann.org/resources/pages/epp-status-codes-2014-06-16-en).
	StatusLists pulumi.StringArrayOutput `pulumi:"statusLists"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Details about the domain technical contact. See Contact Blocks for more details.
	TechContact RegisteredDomainTechContactOutput `pulumi:"techContact"`
	// Whether domain technical contact information is concealed from WHOIS queries. Default: `true`.
	TechPrivacy pulumi.BoolPtrOutput `pulumi:"techPrivacy"`
	// Whether the domain is locked for transfer. Default: `true`.
	TransferLock pulumi.BoolPtrOutput `pulumi:"transferLock"`
	// The last updated date of the domain as found in the response to a WHOIS query.
	UpdatedDate pulumi.StringOutput `pulumi:"updatedDate"`
	// The fully qualified name of the WHOIS server that can answer the WHOIS query for the domain.
	WhoisServer pulumi.StringOutput `pulumi:"whoisServer"`
}

// NewRegisteredDomain registers a new resource with the given unique name, arguments, and options.
func NewRegisteredDomain(ctx *pulumi.Context,
	name string, args *RegisteredDomainArgs, opts ...pulumi.ResourceOption) (*RegisteredDomain, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DomainName == nil {
		return nil, errors.New("invalid value for required argument 'DomainName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RegisteredDomain
	err := ctx.RegisterResource("aws:route53domains/registeredDomain:RegisteredDomain", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRegisteredDomain gets an existing RegisteredDomain resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRegisteredDomain(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RegisteredDomainState, opts ...pulumi.ResourceOption) (*RegisteredDomain, error) {
	var resource RegisteredDomain
	err := ctx.ReadResource("aws:route53domains/registeredDomain:RegisteredDomain", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RegisteredDomain resources.
type registeredDomainState struct {
	// Email address to contact to report incorrect contact information for a domain, to report that the domain is being used to send spam, to report that someone is cybersquatting on a domain name, or report some other type of abuse.
	AbuseContactEmail *string `pulumi:"abuseContactEmail"`
	// Phone number for reporting abuse.
	AbuseContactPhone *string `pulumi:"abuseContactPhone"`
	// Details about the domain administrative contact. See Contact Blocks for more details.
	AdminContact *RegisteredDomainAdminContact `pulumi:"adminContact"`
	// Whether domain administrative contact information is concealed from WHOIS queries. Default: `true`.
	AdminPrivacy *bool `pulumi:"adminPrivacy"`
	// Whether the domain registration is set to renew automatically. Default: `true`.
	AutoRenew *bool `pulumi:"autoRenew"`
	// The date when the domain was created as found in the response to a WHOIS query.
	CreationDate *string `pulumi:"creationDate"`
	// The name of the registered domain.
	DomainName *string `pulumi:"domainName"`
	// The date when the registration for the domain is set to expire.
	ExpirationDate *string `pulumi:"expirationDate"`
	// The list of nameservers for the domain. See `nameServer` Blocks for more details.
	NameServers []RegisteredDomainNameServer `pulumi:"nameServers"`
	// Details about the domain registrant. See Contact Blocks for more details.
	RegistrantContact *RegisteredDomainRegistrantContact `pulumi:"registrantContact"`
	// Whether domain registrant contact information is concealed from WHOIS queries. Default: `true`.
	RegistrantPrivacy *bool `pulumi:"registrantPrivacy"`
	// Name of the registrar of the domain as identified in the registry.
	RegistrarName *string `pulumi:"registrarName"`
	// Web address of the registrar.
	RegistrarUrl *string `pulumi:"registrarUrl"`
	// Reseller of the domain.
	Reseller *string `pulumi:"reseller"`
	// List of [domain name status codes](https://www.icann.org/resources/pages/epp-status-codes-2014-06-16-en).
	StatusLists []string `pulumi:"statusLists"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Details about the domain technical contact. See Contact Blocks for more details.
	TechContact *RegisteredDomainTechContact `pulumi:"techContact"`
	// Whether domain technical contact information is concealed from WHOIS queries. Default: `true`.
	TechPrivacy *bool `pulumi:"techPrivacy"`
	// Whether the domain is locked for transfer. Default: `true`.
	TransferLock *bool `pulumi:"transferLock"`
	// The last updated date of the domain as found in the response to a WHOIS query.
	UpdatedDate *string `pulumi:"updatedDate"`
	// The fully qualified name of the WHOIS server that can answer the WHOIS query for the domain.
	WhoisServer *string `pulumi:"whoisServer"`
}

type RegisteredDomainState struct {
	// Email address to contact to report incorrect contact information for a domain, to report that the domain is being used to send spam, to report that someone is cybersquatting on a domain name, or report some other type of abuse.
	AbuseContactEmail pulumi.StringPtrInput
	// Phone number for reporting abuse.
	AbuseContactPhone pulumi.StringPtrInput
	// Details about the domain administrative contact. See Contact Blocks for more details.
	AdminContact RegisteredDomainAdminContactPtrInput
	// Whether domain administrative contact information is concealed from WHOIS queries. Default: `true`.
	AdminPrivacy pulumi.BoolPtrInput
	// Whether the domain registration is set to renew automatically. Default: `true`.
	AutoRenew pulumi.BoolPtrInput
	// The date when the domain was created as found in the response to a WHOIS query.
	CreationDate pulumi.StringPtrInput
	// The name of the registered domain.
	DomainName pulumi.StringPtrInput
	// The date when the registration for the domain is set to expire.
	ExpirationDate pulumi.StringPtrInput
	// The list of nameservers for the domain. See `nameServer` Blocks for more details.
	NameServers RegisteredDomainNameServerArrayInput
	// Details about the domain registrant. See Contact Blocks for more details.
	RegistrantContact RegisteredDomainRegistrantContactPtrInput
	// Whether domain registrant contact information is concealed from WHOIS queries. Default: `true`.
	RegistrantPrivacy pulumi.BoolPtrInput
	// Name of the registrar of the domain as identified in the registry.
	RegistrarName pulumi.StringPtrInput
	// Web address of the registrar.
	RegistrarUrl pulumi.StringPtrInput
	// Reseller of the domain.
	Reseller pulumi.StringPtrInput
	// List of [domain name status codes](https://www.icann.org/resources/pages/epp-status-codes-2014-06-16-en).
	StatusLists pulumi.StringArrayInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// Details about the domain technical contact. See Contact Blocks for more details.
	TechContact RegisteredDomainTechContactPtrInput
	// Whether domain technical contact information is concealed from WHOIS queries. Default: `true`.
	TechPrivacy pulumi.BoolPtrInput
	// Whether the domain is locked for transfer. Default: `true`.
	TransferLock pulumi.BoolPtrInput
	// The last updated date of the domain as found in the response to a WHOIS query.
	UpdatedDate pulumi.StringPtrInput
	// The fully qualified name of the WHOIS server that can answer the WHOIS query for the domain.
	WhoisServer pulumi.StringPtrInput
}

func (RegisteredDomainState) ElementType() reflect.Type {
	return reflect.TypeOf((*registeredDomainState)(nil)).Elem()
}

type registeredDomainArgs struct {
	// Details about the domain administrative contact. See Contact Blocks for more details.
	AdminContact *RegisteredDomainAdminContact `pulumi:"adminContact"`
	// Whether domain administrative contact information is concealed from WHOIS queries. Default: `true`.
	AdminPrivacy *bool `pulumi:"adminPrivacy"`
	// Whether the domain registration is set to renew automatically. Default: `true`.
	AutoRenew *bool `pulumi:"autoRenew"`
	// The name of the registered domain.
	DomainName string `pulumi:"domainName"`
	// The list of nameservers for the domain. See `nameServer` Blocks for more details.
	NameServers []RegisteredDomainNameServer `pulumi:"nameServers"`
	// Details about the domain registrant. See Contact Blocks for more details.
	RegistrantContact *RegisteredDomainRegistrantContact `pulumi:"registrantContact"`
	// Whether domain registrant contact information is concealed from WHOIS queries. Default: `true`.
	RegistrantPrivacy *bool `pulumi:"registrantPrivacy"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Details about the domain technical contact. See Contact Blocks for more details.
	TechContact *RegisteredDomainTechContact `pulumi:"techContact"`
	// Whether domain technical contact information is concealed from WHOIS queries. Default: `true`.
	TechPrivacy *bool `pulumi:"techPrivacy"`
	// Whether the domain is locked for transfer. Default: `true`.
	TransferLock *bool `pulumi:"transferLock"`
}

// The set of arguments for constructing a RegisteredDomain resource.
type RegisteredDomainArgs struct {
	// Details about the domain administrative contact. See Contact Blocks for more details.
	AdminContact RegisteredDomainAdminContactPtrInput
	// Whether domain administrative contact information is concealed from WHOIS queries. Default: `true`.
	AdminPrivacy pulumi.BoolPtrInput
	// Whether the domain registration is set to renew automatically. Default: `true`.
	AutoRenew pulumi.BoolPtrInput
	// The name of the registered domain.
	DomainName pulumi.StringInput
	// The list of nameservers for the domain. See `nameServer` Blocks for more details.
	NameServers RegisteredDomainNameServerArrayInput
	// Details about the domain registrant. See Contact Blocks for more details.
	RegistrantContact RegisteredDomainRegistrantContactPtrInput
	// Whether domain registrant contact information is concealed from WHOIS queries. Default: `true`.
	RegistrantPrivacy pulumi.BoolPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Details about the domain technical contact. See Contact Blocks for more details.
	TechContact RegisteredDomainTechContactPtrInput
	// Whether domain technical contact information is concealed from WHOIS queries. Default: `true`.
	TechPrivacy pulumi.BoolPtrInput
	// Whether the domain is locked for transfer. Default: `true`.
	TransferLock pulumi.BoolPtrInput
}

func (RegisteredDomainArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*registeredDomainArgs)(nil)).Elem()
}

type RegisteredDomainInput interface {
	pulumi.Input

	ToRegisteredDomainOutput() RegisteredDomainOutput
	ToRegisteredDomainOutputWithContext(ctx context.Context) RegisteredDomainOutput
}

func (*RegisteredDomain) ElementType() reflect.Type {
	return reflect.TypeOf((**RegisteredDomain)(nil)).Elem()
}

func (i *RegisteredDomain) ToRegisteredDomainOutput() RegisteredDomainOutput {
	return i.ToRegisteredDomainOutputWithContext(context.Background())
}

func (i *RegisteredDomain) ToRegisteredDomainOutputWithContext(ctx context.Context) RegisteredDomainOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegisteredDomainOutput)
}

// RegisteredDomainArrayInput is an input type that accepts RegisteredDomainArray and RegisteredDomainArrayOutput values.
// You can construct a concrete instance of `RegisteredDomainArrayInput` via:
//
//	RegisteredDomainArray{ RegisteredDomainArgs{...} }
type RegisteredDomainArrayInput interface {
	pulumi.Input

	ToRegisteredDomainArrayOutput() RegisteredDomainArrayOutput
	ToRegisteredDomainArrayOutputWithContext(context.Context) RegisteredDomainArrayOutput
}

type RegisteredDomainArray []RegisteredDomainInput

func (RegisteredDomainArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RegisteredDomain)(nil)).Elem()
}

func (i RegisteredDomainArray) ToRegisteredDomainArrayOutput() RegisteredDomainArrayOutput {
	return i.ToRegisteredDomainArrayOutputWithContext(context.Background())
}

func (i RegisteredDomainArray) ToRegisteredDomainArrayOutputWithContext(ctx context.Context) RegisteredDomainArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegisteredDomainArrayOutput)
}

// RegisteredDomainMapInput is an input type that accepts RegisteredDomainMap and RegisteredDomainMapOutput values.
// You can construct a concrete instance of `RegisteredDomainMapInput` via:
//
//	RegisteredDomainMap{ "key": RegisteredDomainArgs{...} }
type RegisteredDomainMapInput interface {
	pulumi.Input

	ToRegisteredDomainMapOutput() RegisteredDomainMapOutput
	ToRegisteredDomainMapOutputWithContext(context.Context) RegisteredDomainMapOutput
}

type RegisteredDomainMap map[string]RegisteredDomainInput

func (RegisteredDomainMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RegisteredDomain)(nil)).Elem()
}

func (i RegisteredDomainMap) ToRegisteredDomainMapOutput() RegisteredDomainMapOutput {
	return i.ToRegisteredDomainMapOutputWithContext(context.Background())
}

func (i RegisteredDomainMap) ToRegisteredDomainMapOutputWithContext(ctx context.Context) RegisteredDomainMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegisteredDomainMapOutput)
}

type RegisteredDomainOutput struct{ *pulumi.OutputState }

func (RegisteredDomainOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RegisteredDomain)(nil)).Elem()
}

func (o RegisteredDomainOutput) ToRegisteredDomainOutput() RegisteredDomainOutput {
	return o
}

func (o RegisteredDomainOutput) ToRegisteredDomainOutputWithContext(ctx context.Context) RegisteredDomainOutput {
	return o
}

// Email address to contact to report incorrect contact information for a domain, to report that the domain is being used to send spam, to report that someone is cybersquatting on a domain name, or report some other type of abuse.
func (o RegisteredDomainOutput) AbuseContactEmail() pulumi.StringOutput {
	return o.ApplyT(func(v *RegisteredDomain) pulumi.StringOutput { return v.AbuseContactEmail }).(pulumi.StringOutput)
}

// Phone number for reporting abuse.
func (o RegisteredDomainOutput) AbuseContactPhone() pulumi.StringOutput {
	return o.ApplyT(func(v *RegisteredDomain) pulumi.StringOutput { return v.AbuseContactPhone }).(pulumi.StringOutput)
}

// Details about the domain administrative contact. See Contact Blocks for more details.
func (o RegisteredDomainOutput) AdminContact() RegisteredDomainAdminContactOutput {
	return o.ApplyT(func(v *RegisteredDomain) RegisteredDomainAdminContactOutput { return v.AdminContact }).(RegisteredDomainAdminContactOutput)
}

// Whether domain administrative contact information is concealed from WHOIS queries. Default: `true`.
func (o RegisteredDomainOutput) AdminPrivacy() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RegisteredDomain) pulumi.BoolPtrOutput { return v.AdminPrivacy }).(pulumi.BoolPtrOutput)
}

// Whether the domain registration is set to renew automatically. Default: `true`.
func (o RegisteredDomainOutput) AutoRenew() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RegisteredDomain) pulumi.BoolPtrOutput { return v.AutoRenew }).(pulumi.BoolPtrOutput)
}

// The date when the domain was created as found in the response to a WHOIS query.
func (o RegisteredDomainOutput) CreationDate() pulumi.StringOutput {
	return o.ApplyT(func(v *RegisteredDomain) pulumi.StringOutput { return v.CreationDate }).(pulumi.StringOutput)
}

// The name of the registered domain.
func (o RegisteredDomainOutput) DomainName() pulumi.StringOutput {
	return o.ApplyT(func(v *RegisteredDomain) pulumi.StringOutput { return v.DomainName }).(pulumi.StringOutput)
}

// The date when the registration for the domain is set to expire.
func (o RegisteredDomainOutput) ExpirationDate() pulumi.StringOutput {
	return o.ApplyT(func(v *RegisteredDomain) pulumi.StringOutput { return v.ExpirationDate }).(pulumi.StringOutput)
}

// The list of nameservers for the domain. See `nameServer` Blocks for more details.
func (o RegisteredDomainOutput) NameServers() RegisteredDomainNameServerArrayOutput {
	return o.ApplyT(func(v *RegisteredDomain) RegisteredDomainNameServerArrayOutput { return v.NameServers }).(RegisteredDomainNameServerArrayOutput)
}

// Details about the domain registrant. See Contact Blocks for more details.
func (o RegisteredDomainOutput) RegistrantContact() RegisteredDomainRegistrantContactOutput {
	return o.ApplyT(func(v *RegisteredDomain) RegisteredDomainRegistrantContactOutput { return v.RegistrantContact }).(RegisteredDomainRegistrantContactOutput)
}

// Whether domain registrant contact information is concealed from WHOIS queries. Default: `true`.
func (o RegisteredDomainOutput) RegistrantPrivacy() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RegisteredDomain) pulumi.BoolPtrOutput { return v.RegistrantPrivacy }).(pulumi.BoolPtrOutput)
}

// Name of the registrar of the domain as identified in the registry.
func (o RegisteredDomainOutput) RegistrarName() pulumi.StringOutput {
	return o.ApplyT(func(v *RegisteredDomain) pulumi.StringOutput { return v.RegistrarName }).(pulumi.StringOutput)
}

// Web address of the registrar.
func (o RegisteredDomainOutput) RegistrarUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *RegisteredDomain) pulumi.StringOutput { return v.RegistrarUrl }).(pulumi.StringOutput)
}

// Reseller of the domain.
func (o RegisteredDomainOutput) Reseller() pulumi.StringOutput {
	return o.ApplyT(func(v *RegisteredDomain) pulumi.StringOutput { return v.Reseller }).(pulumi.StringOutput)
}

// List of [domain name status codes](https://www.icann.org/resources/pages/epp-status-codes-2014-06-16-en).
func (o RegisteredDomainOutput) StatusLists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *RegisteredDomain) pulumi.StringArrayOutput { return v.StatusLists }).(pulumi.StringArrayOutput)
}

// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o RegisteredDomainOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *RegisteredDomain) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o RegisteredDomainOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *RegisteredDomain) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Details about the domain technical contact. See Contact Blocks for more details.
func (o RegisteredDomainOutput) TechContact() RegisteredDomainTechContactOutput {
	return o.ApplyT(func(v *RegisteredDomain) RegisteredDomainTechContactOutput { return v.TechContact }).(RegisteredDomainTechContactOutput)
}

// Whether domain technical contact information is concealed from WHOIS queries. Default: `true`.
func (o RegisteredDomainOutput) TechPrivacy() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RegisteredDomain) pulumi.BoolPtrOutput { return v.TechPrivacy }).(pulumi.BoolPtrOutput)
}

// Whether the domain is locked for transfer. Default: `true`.
func (o RegisteredDomainOutput) TransferLock() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RegisteredDomain) pulumi.BoolPtrOutput { return v.TransferLock }).(pulumi.BoolPtrOutput)
}

// The last updated date of the domain as found in the response to a WHOIS query.
func (o RegisteredDomainOutput) UpdatedDate() pulumi.StringOutput {
	return o.ApplyT(func(v *RegisteredDomain) pulumi.StringOutput { return v.UpdatedDate }).(pulumi.StringOutput)
}

// The fully qualified name of the WHOIS server that can answer the WHOIS query for the domain.
func (o RegisteredDomainOutput) WhoisServer() pulumi.StringOutput {
	return o.ApplyT(func(v *RegisteredDomain) pulumi.StringOutput { return v.WhoisServer }).(pulumi.StringOutput)
}

type RegisteredDomainArrayOutput struct{ *pulumi.OutputState }

func (RegisteredDomainArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RegisteredDomain)(nil)).Elem()
}

func (o RegisteredDomainArrayOutput) ToRegisteredDomainArrayOutput() RegisteredDomainArrayOutput {
	return o
}

func (o RegisteredDomainArrayOutput) ToRegisteredDomainArrayOutputWithContext(ctx context.Context) RegisteredDomainArrayOutput {
	return o
}

func (o RegisteredDomainArrayOutput) Index(i pulumi.IntInput) RegisteredDomainOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RegisteredDomain {
		return vs[0].([]*RegisteredDomain)[vs[1].(int)]
	}).(RegisteredDomainOutput)
}

type RegisteredDomainMapOutput struct{ *pulumi.OutputState }

func (RegisteredDomainMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RegisteredDomain)(nil)).Elem()
}

func (o RegisteredDomainMapOutput) ToRegisteredDomainMapOutput() RegisteredDomainMapOutput {
	return o
}

func (o RegisteredDomainMapOutput) ToRegisteredDomainMapOutputWithContext(ctx context.Context) RegisteredDomainMapOutput {
	return o
}

func (o RegisteredDomainMapOutput) MapIndex(k pulumi.StringInput) RegisteredDomainOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RegisteredDomain {
		return vs[0].(map[string]*RegisteredDomain)[vs[1].(string)]
	}).(RegisteredDomainOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RegisteredDomainInput)(nil)).Elem(), &RegisteredDomain{})
	pulumi.RegisterInputType(reflect.TypeOf((*RegisteredDomainArrayInput)(nil)).Elem(), RegisteredDomainArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RegisteredDomainMapInput)(nil)).Elem(), RegisteredDomainMap{})
	pulumi.RegisterOutputType(RegisteredDomainOutput{})
	pulumi.RegisterOutputType(RegisteredDomainArrayOutput{})
	pulumi.RegisterOutputType(RegisteredDomainMapOutput{})
}
