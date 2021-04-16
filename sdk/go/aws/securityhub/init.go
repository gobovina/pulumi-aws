// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package securityhub

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws"
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
	case "aws:securityhub/inviteAccepter:InviteAccepter":
		r = &InviteAccepter{}
	case "aws:securityhub/member:Member":
		r = &Member{}
	case "aws:securityhub/organizationAdminAccount:OrganizationAdminAccount":
		r = &OrganizationAdminAccount{}
	case "aws:securityhub/productSubscription:ProductSubscription":
		r = &ProductSubscription{}
	case "aws:securityhub/standardsSubscription:StandardsSubscription":
		r = &StandardsSubscription{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := aws.PkgVersion()
	if err != nil {
		fmt.Println("failed to determine package version. defaulting to v1: %v", err)
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
		"securityhub/productSubscription",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"securityhub/standardsSubscription",
		&module{version},
	)
}
