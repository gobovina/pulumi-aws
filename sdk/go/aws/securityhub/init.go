// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package securityhub

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "aws:securityhub/account:Account":
		r = &Account{}
	case "aws:securityhub/actionTarget:ActionTarget":
		r = &ActionTarget{}
	case "aws:securityhub/automationRule:AutomationRule":
		r = &AutomationRule{}
	case "aws:securityhub/configurationPolicy:ConfigurationPolicy":
		r = &ConfigurationPolicy{}
	case "aws:securityhub/configurationPolicyAssociation:ConfigurationPolicyAssociation":
		r = &ConfigurationPolicyAssociation{}
	case "aws:securityhub/findingAggregator:FindingAggregator":
		r = &FindingAggregator{}
	case "aws:securityhub/insight:Insight":
		r = &Insight{}
	case "aws:securityhub/inviteAccepter:InviteAccepter":
		r = &InviteAccepter{}
	case "aws:securityhub/member:Member":
		r = &Member{}
	case "aws:securityhub/organizationAdminAccount:OrganizationAdminAccount":
		r = &OrganizationAdminAccount{}
	case "aws:securityhub/organizationConfiguration:OrganizationConfiguration":
		r = &OrganizationConfiguration{}
	case "aws:securityhub/productSubscription:ProductSubscription":
		r = &ProductSubscription{}
	case "aws:securityhub/standardsControl:StandardsControl":
		r = &StandardsControl{}
	case "aws:securityhub/standardsSubscription:StandardsSubscription":
		r = &StandardsSubscription{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"aws",
		"securityhub/account",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"securityhub/actionTarget",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"securityhub/automationRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"securityhub/configurationPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"securityhub/configurationPolicyAssociation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"securityhub/findingAggregator",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"securityhub/insight",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"securityhub/inviteAccepter",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"securityhub/member",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"securityhub/organizationAdminAccount",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"securityhub/organizationConfiguration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"securityhub/productSubscription",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"securityhub/standardsControl",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"securityhub/standardsSubscription",
		&module{version},
	)
}
