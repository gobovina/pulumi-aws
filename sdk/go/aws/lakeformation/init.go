// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package lakeformation

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
	case "aws:lakeformation/dataCellsFilter:DataCellsFilter":
		r = &DataCellsFilter{}
	case "aws:lakeformation/dataLakeSettings:DataLakeSettings":
		r = &DataLakeSettings{}
	case "aws:lakeformation/lfTag:LfTag":
		r = &LfTag{}
	case "aws:lakeformation/permissions:Permissions":
		r = &Permissions{}
	case "aws:lakeformation/resource:Resource":
		r = &Resource{}
	case "aws:lakeformation/resourceLfTags:ResourceLfTags":
		r = &ResourceLfTags{}
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
		"lakeformation/dataCellsFilter",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"lakeformation/dataLakeSettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"lakeformation/lfTag",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"lakeformation/permissions",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"lakeformation/resource",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"lakeformation/resourceLfTags",
		&module{version},
	)
}
