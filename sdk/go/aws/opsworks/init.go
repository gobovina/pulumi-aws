// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package opsworks

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws"
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
	case "aws:opsworks/application:Application":
		r = &Application{}
	case "aws:opsworks/customLayer:CustomLayer":
		r = &CustomLayer{}
	case "aws:opsworks/ecsClusterLayer:EcsClusterLayer":
		r = &EcsClusterLayer{}
	case "aws:opsworks/gangliaLayer:GangliaLayer":
		r = &GangliaLayer{}
	case "aws:opsworks/haproxyLayer:HaproxyLayer":
		r = &HaproxyLayer{}
	case "aws:opsworks/instance:Instance":
		r = &Instance{}
	case "aws:opsworks/javaAppLayer:JavaAppLayer":
		r = &JavaAppLayer{}
	case "aws:opsworks/memcachedLayer:MemcachedLayer":
		r = &MemcachedLayer{}
	case "aws:opsworks/mysqlLayer:MysqlLayer":
		r = &MysqlLayer{}
	case "aws:opsworks/nodejsAppLayer:NodejsAppLayer":
		r = &NodejsAppLayer{}
	case "aws:opsworks/permission:Permission":
		r = &Permission{}
	case "aws:opsworks/phpAppLayer:PhpAppLayer":
		r = &PhpAppLayer{}
	case "aws:opsworks/railsAppLayer:RailsAppLayer":
		r = &RailsAppLayer{}
	case "aws:opsworks/rdsDbInstance:RdsDbInstance":
		r = &RdsDbInstance{}
	case "aws:opsworks/stack:Stack":
		r = &Stack{}
	case "aws:opsworks/staticWebLayer:StaticWebLayer":
		r = &StaticWebLayer{}
	case "aws:opsworks/userProfile:UserProfile":
		r = &UserProfile{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := aws.PkgVersion()
	if err != nil {
		fmt.Printf("failed to determine package version. defaulting to v1: %v\n", err)
	}
	pulumi.RegisterResourceModule(
		"aws",
		"opsworks/application",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"opsworks/customLayer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"opsworks/ecsClusterLayer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"opsworks/gangliaLayer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"opsworks/haproxyLayer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"opsworks/instance",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"opsworks/javaAppLayer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"opsworks/memcachedLayer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"opsworks/mysqlLayer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"opsworks/nodejsAppLayer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"opsworks/permission",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"opsworks/phpAppLayer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"opsworks/railsAppLayer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"opsworks/rdsDbInstance",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"opsworks/stack",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"opsworks/staticWebLayer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"opsworks/userProfile",
		&module{version},
	)
}
