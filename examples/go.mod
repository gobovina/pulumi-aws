module github.com/pulumi/pulumi-aws/examples/v6

go 1.21.0

require (
	github.com/aws/aws-sdk-go v1.50.38
	github.com/pulumi/providertest v0.0.11
	github.com/pulumi/pulumi-aws/provider/v6 v6.0.0-00010101000000-000000000000
	github.com/pulumi/pulumi-terraform-bridge/pf v0.30.1-0.20240311191722-54802d5b003c
	github.com/pulumi/pulumi-terraform-bridge/testing v0.0.2-0.20230927165309-e3fd9503f2d3
	github.com/pulumi/pulumi/pkg/v3 v3.108.1
	github.com/stretchr/testify v1.8.4
)

// Replace to allow for correctly linking the aws provider.
//
// We use this for gRPC based testing.
replace (
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20240229143312-4f60ee4e2975

	github.com/hashicorp/terraform-provider-aws => ../upstream
	github.com/pulumi/pulumi-aws/provider/v6 => ../provider
)

// This replace is copied from upstream/go.mod, and should be maintained only as long as upstream maintains the same replace.
replace github.com/hashicorp/terraform-plugin-log => github.com/gdavison/terraform-plugin-log v0.0.0-20230928191232-6c653d8ef8fb

require (
	cloud.google.com/go v0.112.0 // indirect
	cloud.google.com/go/compute v1.23.3 // indirect
	cloud.google.com/go/compute/metadata v0.2.3 // indirect
	cloud.google.com/go/iam v1.1.5 // indirect
	cloud.google.com/go/kms v1.15.5 // indirect
	cloud.google.com/go/logging v1.9.0 // indirect
	cloud.google.com/go/longrunning v0.5.4 // indirect
	cloud.google.com/go/storage v1.36.0 // indirect
	dario.cat/mergo v1.0.0 // indirect
	github.com/Azure/azure-sdk-for-go/sdk/azcore v1.9.0 // indirect
	github.com/Azure/azure-sdk-for-go/sdk/azidentity v1.4.0 // indirect
	github.com/Azure/azure-sdk-for-go/sdk/internal v1.5.0 // indirect
	github.com/Azure/azure-sdk-for-go/sdk/keyvault/azkeys v0.10.0 // indirect
	github.com/Azure/azure-sdk-for-go/sdk/keyvault/internal v0.7.1 // indirect
	github.com/AzureAD/microsoft-authentication-library-for-go v1.2.0 // indirect
	github.com/Masterminds/semver v1.5.0 // indirect
	github.com/Microsoft/go-winio v0.6.1 // indirect
	github.com/ProtonMail/go-crypto v1.1.0-alpha.0 // indirect
	github.com/YakDriver/go-version v0.1.0 // indirect
	github.com/YakDriver/regexache v0.23.0 // indirect
	github.com/aead/chacha20 v0.0.0-20180709150244-8b13a72661da // indirect
	github.com/agext/levenshtein v1.2.3 // indirect
	github.com/apparentlymart/go-textseg/v15 v15.0.0 // indirect
	github.com/armon/go-metrics v0.4.0 // indirect
	github.com/armon/go-radix v1.0.0 // indirect
	github.com/atotto/clipboard v0.1.4 // indirect
	github.com/aws/aws-sdk-go-v2 v1.25.3 // indirect
	github.com/aws/aws-sdk-go-v2/aws/protocol/eventstream v1.6.1 // indirect
	github.com/aws/aws-sdk-go-v2/config v1.27.7 // indirect
	github.com/aws/aws-sdk-go-v2/credentials v1.17.7 // indirect
	github.com/aws/aws-sdk-go-v2/feature/ec2/imds v1.15.3 // indirect
	github.com/aws/aws-sdk-go-v2/feature/s3/manager v1.16.10 // indirect
	github.com/aws/aws-sdk-go-v2/internal/configsources v1.3.3 // indirect
	github.com/aws/aws-sdk-go-v2/internal/endpoints/v2 v2.6.3 // indirect
	github.com/aws/aws-sdk-go-v2/internal/ini v1.8.0 // indirect
	github.com/aws/aws-sdk-go-v2/internal/v4a v1.3.3 // indirect
	github.com/aws/aws-sdk-go-v2/service/accessanalyzer v1.28.3 // indirect
	github.com/aws/aws-sdk-go-v2/service/account v1.16.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/acm v1.25.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/amp v1.25.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/appconfig v1.29.0 // indirect
	github.com/aws/aws-sdk-go-v2/service/appfabric v1.7.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/appflow v1.41.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/apprunner v1.28.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/athena v1.40.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/auditmanager v1.32.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/batch v1.35.0 // indirect
	github.com/aws/aws-sdk-go-v2/service/bedrock v1.7.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/bedrockagent v1.4.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/budgets v1.22.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/chimesdkmediapipelines v1.15.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/chimesdkvoice v1.14.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/cleanrooms v1.10.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/cloud9 v1.24.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/cloudcontrol v1.18.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/cloudfront v1.35.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/cloudfrontkeyvaluestore v1.4.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/cloudhsmv2 v1.21.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/cloudsearch v1.22.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/cloudtrail v1.39.0 // indirect
	github.com/aws/aws-sdk-go-v2/service/cloudwatch v1.36.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/cloudwatchlogs v1.34.3 // indirect
	github.com/aws/aws-sdk-go-v2/service/codeartifact v1.25.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/codebuild v1.30.3 // indirect
	github.com/aws/aws-sdk-go-v2/service/codecatalyst v1.12.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/codecommit v1.22.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/codedeploy v1.25.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/codeguruprofiler v1.20.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/codegurureviewer v1.25.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/codepipeline v1.26.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/codestarconnections v1.25.0 // indirect
	github.com/aws/aws-sdk-go-v2/service/codestarnotifications v1.22.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/cognitoidentity v1.23.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/comprehend v1.31.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/computeoptimizer v1.33.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/configservice v1.46.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/connectcases v1.15.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/controltower v1.13.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/costoptimizationhub v1.4.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/customerprofiles v1.36.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/dax v1.19.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/devopsguru v1.30.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/directoryservice v1.24.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/docdbelastic v1.9.1 // indirect
	github.com/aws/aws-sdk-go-v2/service/dynamodb v1.30.4 // indirect
	github.com/aws/aws-sdk-go-v2/service/ec2 v1.150.1 // indirect
	github.com/aws/aws-sdk-go-v2/service/ecr v1.27.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/ecs v1.41.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/eks v1.41.1 // indirect
	github.com/aws/aws-sdk-go-v2/service/elasticache v1.37.3 // indirect
	github.com/aws/aws-sdk-go-v2/service/elasticbeanstalk v1.23.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/elasticloadbalancingv2 v1.30.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/emr v1.39.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/emrserverless v1.17.3 // indirect
	github.com/aws/aws-sdk-go-v2/service/evidently v1.19.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/finspace v1.22.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/firehose v1.28.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/fis v1.23.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/glacier v1.22.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/groundstation v1.26.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/healthlake v1.23.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/iam v1.31.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/identitystore v1.23.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/inspector2 v1.24.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/internal/accept-encoding v1.11.1 // indirect
	github.com/aws/aws-sdk-go-v2/service/internal/checksum v1.3.5 // indirect
	github.com/aws/aws-sdk-go-v2/service/internal/endpoint-discovery v1.9.4 // indirect
	github.com/aws/aws-sdk-go-v2/service/internal/presigned-url v1.11.5 // indirect
	github.com/aws/aws-sdk-go-v2/service/internal/s3shared v1.17.3 // indirect
	github.com/aws/aws-sdk-go-v2/service/internetmonitor v1.12.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/ivschat v1.12.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/kafka v1.31.0 // indirect
	github.com/aws/aws-sdk-go-v2/service/kendra v1.49.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/keyspaces v1.10.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/kinesis v1.27.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/kms v1.27.5 // indirect
	github.com/aws/aws-sdk-go-v2/service/lakeformation v1.31.3 // indirect
	github.com/aws/aws-sdk-go-v2/service/lambda v1.53.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/launchwizard v1.3.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/lexmodelsv2 v1.43.1 // indirect
	github.com/aws/aws-sdk-go-v2/service/lightsail v1.36.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/lookoutmetrics v1.27.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/m2 v1.12.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/mediaconnect v1.28.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/mediaconvert v1.52.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/medialive v1.48.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/mediapackage v1.30.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/mediapackagev2 v1.10.0 // indirect
	github.com/aws/aws-sdk-go-v2/service/mediastore v1.20.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/mq v1.22.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/mwaa v1.26.3 // indirect
	github.com/aws/aws-sdk-go-v2/service/oam v1.9.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/opensearchserverless v1.11.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/osis v1.8.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/pcaconnectorad v1.5.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/pipes v1.11.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/polly v1.39.4 // indirect
	github.com/aws/aws-sdk-go-v2/service/pricing v1.27.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/qbusiness v1.4.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/qldb v1.21.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/rbin v1.16.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/rds v1.75.1 // indirect
	github.com/aws/aws-sdk-go-v2/service/redshift v1.43.3 // indirect
	github.com/aws/aws-sdk-go-v2/service/redshiftdata v1.25.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/redshiftserverless v1.17.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/rekognition v1.39.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/resourceexplorer2 v1.10.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/resourcegroups v1.21.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/resourcegroupstaggingapi v1.21.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/rolesanywhere v1.8.3 // indirect
	github.com/aws/aws-sdk-go-v2/service/route53domains v1.23.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/s3 v1.52.0 // indirect
	github.com/aws/aws-sdk-go-v2/service/s3control v1.44.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/scheduler v1.8.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/secretsmanager v1.28.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/securityhub v1.46.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/securitylake v1.13.1 // indirect
	github.com/aws/aws-sdk-go-v2/service/servicecatalogappregistry v1.26.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/servicequotas v1.21.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/sesv2 v1.27.1 // indirect
	github.com/aws/aws-sdk-go-v2/service/shield v1.25.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/signer v1.22.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/sns v1.29.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/sqs v1.31.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/ssm v1.49.3 // indirect
	github.com/aws/aws-sdk-go-v2/service/ssmcontacts v1.22.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/ssmincidents v1.30.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/ssmsap v1.12.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/sso v1.20.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/ssoadmin v1.25.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/ssooidc v1.23.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/sts v1.28.4 // indirect
	github.com/aws/aws-sdk-go-v2/service/swf v1.22.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/synthetics v1.24.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/timestreamwrite v1.25.3 // indirect
	github.com/aws/aws-sdk-go-v2/service/transcribe v1.36.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/transfer v1.44.0 // indirect
	github.com/aws/aws-sdk-go-v2/service/verifiedpermissions v1.11.1 // indirect
	github.com/aws/aws-sdk-go-v2/service/vpclattice v1.7.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/wellarchitected v1.29.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/workspaces v1.38.2 // indirect
	github.com/aws/aws-sdk-go-v2/service/xray v1.25.2 // indirect
	github.com/aws/smithy-go v1.20.1 // indirect
	github.com/aymanbagabas/go-osc52/v2 v2.0.1 // indirect
	github.com/beevik/etree v1.3.0 // indirect
	github.com/blang/semver v3.5.1+incompatible // indirect
	github.com/cenkalti/backoff/v3 v3.2.2 // indirect
	github.com/charmbracelet/bubbles v0.16.1 // indirect
	github.com/charmbracelet/bubbletea v0.24.2 // indirect
	github.com/charmbracelet/lipgloss v0.7.1 // indirect
	github.com/cheggaaa/pb v1.0.29 // indirect
	github.com/cloudflare/circl v1.3.7 // indirect
	github.com/containerd/console v1.0.4-0.20230313162750-1ae8d489ac81 // indirect
	github.com/cyphar/filepath-securejoin v0.2.4 // indirect
	github.com/davecgh/go-spew v1.1.1 // indirect
	github.com/deckarep/golang-set/v2 v2.5.0 // indirect
	github.com/djherbis/times v1.5.0 // indirect
	github.com/edsrzf/mmap-go v1.1.0 // indirect
	github.com/emirpasic/gods v1.18.1 // indirect
	github.com/fatih/color v1.16.0 // indirect
	github.com/felixge/httpsnoop v1.0.4 // indirect
	github.com/fsnotify/fsnotify v1.7.0 // indirect
	github.com/gedex/inflector v0.0.0-20170307190818-16278e9db813 // indirect
	github.com/gertd/go-pluralize v0.2.1 // indirect
	github.com/go-git/gcfg v1.5.1-0.20230307220236-3a3c6141e376 // indirect
	github.com/go-git/go-billy/v5 v5.5.0 // indirect
	github.com/go-git/go-git/v5 v5.11.0 // indirect
	github.com/go-logr/logr v1.4.1 // indirect
	github.com/go-logr/stdr v1.2.2 // indirect
	github.com/gofrs/uuid v4.2.0+incompatible // indirect
	github.com/gogo/protobuf v1.3.2 // indirect
	github.com/golang-jwt/jwt/v5 v5.1.0 // indirect
	github.com/golang/glog v1.2.0 // indirect
	github.com/golang/groupcache v0.0.0-20210331224755-41bb18bfe9da // indirect
	github.com/golang/protobuf v1.5.3 // indirect
	github.com/golang/snappy v0.0.4 // indirect
	github.com/google/go-cmp v0.6.0 // indirect
	github.com/google/go-querystring v1.1.0 // indirect
	github.com/google/s2a-go v0.1.7 // indirect
	github.com/google/uuid v1.6.0 // indirect
	github.com/google/wire v0.5.0 // indirect
	github.com/googleapis/enterprise-certificate-proxy v0.3.2 // indirect
	github.com/googleapis/gax-go/v2 v2.12.0 // indirect
	github.com/gorilla/mux v1.8.0 // indirect
	github.com/grpc-ecosystem/grpc-opentracing v0.0.0-20180507213350-8e809c8a8645 // indirect
	github.com/hashicorp/aws-cloudformation-resource-schema-sdk-go v0.21.0 // indirect
	github.com/hashicorp/aws-sdk-go-base v1.1.0 // indirect
	github.com/hashicorp/aws-sdk-go-base/v2 v2.0.0-beta.49 // indirect
	github.com/hashicorp/aws-sdk-go-base/v2/awsv1shim/v2 v2.0.0-beta.50 // indirect
	github.com/hashicorp/awspolicyequivalence v1.6.0 // indirect
	github.com/hashicorp/errwrap v1.1.0 // indirect
	github.com/hashicorp/go-checkpoint v0.5.0 // indirect
	github.com/hashicorp/go-cleanhttp v0.5.2 // indirect
	github.com/hashicorp/go-cty v1.4.1-0.20200723130312-85980079f637 // indirect
	github.com/hashicorp/go-hclog v1.6.2 // indirect
	github.com/hashicorp/go-immutable-radix v1.3.1 // indirect
	github.com/hashicorp/go-multierror v1.1.1 // indirect
	github.com/hashicorp/go-plugin v1.6.0 // indirect
	github.com/hashicorp/go-retryablehttp v0.7.1 // indirect
	github.com/hashicorp/go-rootcerts v1.0.2 // indirect
	github.com/hashicorp/go-secure-stdlib/mlock v0.1.2 // indirect
	github.com/hashicorp/go-secure-stdlib/parseutil v0.1.6 // indirect
	github.com/hashicorp/go-secure-stdlib/strutil v0.1.2 // indirect
	github.com/hashicorp/go-sockaddr v1.0.2 // indirect
	github.com/hashicorp/go-uuid v1.0.3 // indirect
	github.com/hashicorp/go-version v1.6.0 // indirect
	github.com/hashicorp/golang-lru v0.5.4 // indirect
	github.com/hashicorp/hc-install v0.6.3 // indirect
	github.com/hashicorp/hcl v1.0.0 // indirect
	github.com/hashicorp/hcl/v2 v2.20.0 // indirect
	github.com/hashicorp/logutils v1.0.0 // indirect
	github.com/hashicorp/terraform-exec v0.20.0 // indirect
	github.com/hashicorp/terraform-json v0.21.0 // indirect
	github.com/hashicorp/terraform-plugin-framework v1.6.1 // indirect
	github.com/hashicorp/terraform-plugin-framework-jsontypes v0.1.0 // indirect
	github.com/hashicorp/terraform-plugin-framework-timeouts v0.4.1 // indirect
	github.com/hashicorp/terraform-plugin-framework-timetypes v0.3.0 // indirect
	github.com/hashicorp/terraform-plugin-framework-validators v0.12.0 // indirect
	github.com/hashicorp/terraform-plugin-go v0.22.0 // indirect
	github.com/hashicorp/terraform-plugin-log v0.9.0 // indirect
	github.com/hashicorp/terraform-plugin-mux v0.15.0 // indirect
	github.com/hashicorp/terraform-plugin-sdk/v2 v2.33.0 // indirect
	github.com/hashicorp/terraform-plugin-testing v1.7.0 // indirect
	github.com/hashicorp/terraform-provider-aws v1.60.1-0.20220923175450-ca71523cdc36 // indirect
	github.com/hashicorp/terraform-registry-address v0.2.3 // indirect
	github.com/hashicorp/terraform-svchost v0.1.1 // indirect
	github.com/hashicorp/vault/api v1.8.2 // indirect
	github.com/hashicorp/vault/sdk v0.6.1 // indirect
	github.com/hashicorp/yamux v0.1.1 // indirect
	github.com/inconshreveable/mousetrap v1.1.0 // indirect
	github.com/jbenet/go-context v0.0.0-20150711004518-d14ea06fba99 // indirect
	github.com/jmespath/go-jmespath v0.4.0 // indirect
	github.com/json-iterator/go v1.1.12 // indirect
	github.com/kevinburke/ssh_config v1.2.0 // indirect
	github.com/kylelemons/godebug v1.1.0 // indirect
	github.com/lucasb-eyer/go-colorful v1.2.0 // indirect
	github.com/mattbaird/jsonpatch v0.0.0-20230413205102-771768614e91 // indirect
	github.com/mattn/go-colorable v0.1.13 // indirect
	github.com/mattn/go-isatty v0.0.20 // indirect
	github.com/mattn/go-localereader v0.0.1 // indirect
	github.com/mattn/go-runewidth v0.0.15 // indirect
	github.com/mitchellh/copystructure v1.2.0 // indirect
	github.com/mitchellh/go-homedir v1.1.0 // indirect
	github.com/mitchellh/go-ps v1.0.0 // indirect
	github.com/mitchellh/go-testing-interface v1.14.1 // indirect
	github.com/mitchellh/go-wordwrap v1.0.1 // indirect
	github.com/mitchellh/mapstructure v1.5.0 // indirect
	github.com/mitchellh/reflectwalk v1.0.2 // indirect
	github.com/modern-go/concurrent v0.0.0-20180306012644-bacd9c7ef1dd // indirect
	github.com/modern-go/reflect2 v1.0.2 // indirect
	github.com/muesli/ansi v0.0.0-20230316100256-276c6243b2f6 // indirect
	github.com/muesli/cancelreader v0.2.2 // indirect
	github.com/muesli/reflow v0.3.0 // indirect
	github.com/muesli/termenv v0.15.2 // indirect
	github.com/natefinch/atomic v1.0.1 // indirect
	github.com/nxadm/tail v1.4.8 // indirect
	github.com/oklog/run v1.1.0 // indirect
	github.com/opentracing/basictracer-go v1.1.0 // indirect
	github.com/opentracing/opentracing-go v1.2.0 // indirect
	github.com/pgavlin/fx v0.1.6 // indirect
	github.com/pgavlin/goldmark v1.1.33-0.20200616210433-b5eb04559386 // indirect
	github.com/pierrec/lz4 v2.6.1+incompatible // indirect
	github.com/pjbgf/sha1cd v0.3.0 // indirect
	github.com/pkg/browser v0.0.0-20210911075715-681adbf594b8 // indirect
	github.com/pkg/errors v0.9.1 // indirect
	github.com/pkg/term v1.1.0 // indirect
	github.com/pmezard/go-difflib v1.0.0 // indirect
	github.com/pulumi/appdash v0.0.0-20231130102222-75f619a67231 // indirect
	github.com/pulumi/esc v0.6.2 // indirect
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.77.1-0.20240311191722-54802d5b003c // indirect
	github.com/pulumi/pulumi-terraform-bridge/x/muxer v0.0.8 // indirect
	github.com/pulumi/pulumi/sdk/v3 v3.108.1 // indirect
	github.com/pulumi/terraform-diff-reader v0.0.2 // indirect
	github.com/rivo/uniseg v0.4.4 // indirect
	github.com/rogpeppe/go-internal v1.11.0 // indirect
	github.com/ryanuber/go-glob v1.0.0 // indirect
	github.com/sabhiram/go-gitignore v0.0.0-20210923224102-525f6e181f06 // indirect
	github.com/santhosh-tekuri/jsonschema/v5 v5.0.0 // indirect
	github.com/segmentio/asm v1.1.3 // indirect
	github.com/segmentio/encoding v0.3.5 // indirect
	github.com/sergi/go-diff v1.3.1 // indirect
	github.com/shopspring/decimal v1.3.1 // indirect
	github.com/skeema/knownhosts v1.2.1 // indirect
	github.com/spf13/cobra v1.7.0 // indirect
	github.com/spf13/pflag v1.0.5 // indirect
	github.com/texttheater/golang-levenshtein v1.0.1 // indirect
	github.com/tweekmonster/luser v0.0.0-20161003172636-3fa38070dbd7 // indirect
	github.com/uber/jaeger-client-go v2.30.0+incompatible // indirect
	github.com/uber/jaeger-lib v2.4.1+incompatible // indirect
	github.com/vmihailenco/msgpack v4.0.4+incompatible // indirect
	github.com/vmihailenco/msgpack/v5 v5.4.1 // indirect
	github.com/vmihailenco/tagparser/v2 v2.0.0 // indirect
	github.com/xanzy/ssh-agent v0.3.3 // indirect
	github.com/xeipuuv/gojsonpointer v0.0.0-20190905194746-02993c407bfb // indirect
	github.com/xeipuuv/gojsonreference v0.0.0-20180127040603-bd5ef7bd5415 // indirect
	github.com/xeipuuv/gojsonschema v1.2.0 // indirect
	github.com/zclconf/go-cty v1.14.3 // indirect
	go.opencensus.io v0.24.0 // indirect
	go.opentelemetry.io/contrib/instrumentation/github.com/aws/aws-sdk-go-v2/otelaws v0.49.0 // indirect
	go.opentelemetry.io/contrib/instrumentation/google.golang.org/grpc/otelgrpc v0.46.1 // indirect
	go.opentelemetry.io/contrib/instrumentation/net/http/otelhttp v0.46.1 // indirect
	go.opentelemetry.io/otel v1.24.0 // indirect
	go.opentelemetry.io/otel/metric v1.24.0 // indirect
	go.opentelemetry.io/otel/trace v1.24.0 // indirect
	go.uber.org/atomic v1.9.0 // indirect
	gocloud.dev v0.36.0 // indirect
	gocloud.dev/secrets/hashivault v0.27.0 // indirect
	golang.org/x/crypto v0.21.0 // indirect
	golang.org/x/exp v0.0.0-20231110203233-9a3e6036ecaa // indirect
	golang.org/x/mod v0.15.0 // indirect
	golang.org/x/net v0.22.0 // indirect
	golang.org/x/oauth2 v0.16.0 // indirect
	golang.org/x/sync v0.6.0 // indirect
	golang.org/x/sys v0.18.0 // indirect
	golang.org/x/term v0.18.0 // indirect
	golang.org/x/text v0.14.0 // indirect
	golang.org/x/time v0.5.0 // indirect
	golang.org/x/tools v0.18.0 // indirect
	golang.org/x/xerrors v0.0.0-20231012003039-104605ab7028 // indirect
	google.golang.org/api v0.155.0 // indirect
	google.golang.org/appengine v1.6.8 // indirect
	google.golang.org/genproto v0.0.0-20240123012728-ef4313101c80 // indirect
	google.golang.org/genproto/googleapis/api v0.0.0-20240123012728-ef4313101c80 // indirect
	google.golang.org/genproto/googleapis/rpc v0.0.0-20240123012728-ef4313101c80 // indirect
	google.golang.org/grpc v1.62.0 // indirect
	google.golang.org/protobuf v1.32.0 // indirect
	gopkg.in/square/go-jose.v2 v2.6.0 // indirect
	gopkg.in/tomb.v1 v1.0.0-20141024135613-dd632973f1e7 // indirect
	gopkg.in/warnings.v0 v0.1.2 // indirect
	gopkg.in/yaml.v2 v2.4.0 // indirect
	gopkg.in/yaml.v3 v3.0.1 // indirect
	lukechampine.com/frand v1.4.2 // indirect
)
